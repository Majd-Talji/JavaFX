package _02_Tools_Basic._18_Hyperlink_Webview._08_WebView_JSObject_In_JavaScript_Call_JavaFX;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.concurrent.Worker.State;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import netscape.javascript.JSObject;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    private DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    private Label label;

    public class Bridge {

        public void showTime() {
            System.out.println("Show Time");

            label.setText("Now is: " + df.format(new Date()));
        }
    }

    private static String HTML_STRING = "<html>\n"
            + "\n"
            + "<head>\n"
            + "    <script language=\"javascript\">\n"
            + "        function callToJavaFX() {\n"
            + "            myJavaMember.showTime();\n"
            + "        }\n"
            + "    </script>\n"
            + "</head>\n"
            + "\n"
            + "<body>\n"
            + "    <h1>This is HTML content</h1>\n"
            + "    <button onclick=\"callToJavaFX();\">Call To JavaFX</button>\n"
            + "</body>\n"
            + "\n"
            + "</html>";

    @Override
    public void start(Stage stage) {

        label = new Label("-");

        final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();

        webEngine.setJavaScriptEnabled(true);

        Worker<Void> worker = webEngine.getLoadWorker();

        worker.stateProperty().addListener(new ChangeListener<State>() {
            @Override
            public void changed(ObservableValue<? extends State> observable, State oldValue, State newValue) {
                if (newValue == State.SUCCEEDED) {
                    JSObject jsobj = (JSObject) webEngine.executeScript("window");
                    jsobj.setMember("myJavaMember", new Bridge());
                }
            }
        });

        webEngine.loadContent(HTML_STRING);

        VBox root = new VBox();
        root.setPadding(new Insets(5));
        root.setSpacing(5);

        root.getChildren().addAll(label, browser);

        Scene scene = new Scene(root, 600, 500);

        stage.setTitle("JavaFX WebView");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
