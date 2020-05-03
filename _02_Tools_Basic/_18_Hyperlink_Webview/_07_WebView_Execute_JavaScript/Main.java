package _02_Tools_Basic._18_Hyperlink_Webview._07_WebView_Execute_JavaScript;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    private static String HTML_STRING = "<html>"
            + ""
            + "<head>"
            + "    <script language='javascript'>"
            + "        function changeBackgroundColor() {"
            + "            var color = document.getElementById('color').value;"
            + "            document.body.style.backgroundColor = color;"
            + "        }"
            + "    </script>"
            + "</head>"
            + ""
            + "<body>"
            + "    <h2>This is HTMl content</h2>"
            + "    <b>Enter Color:</b>"
            + "    <input id='color' value='yellow' />"
            + "    <button onclick='changeBackgroundColor();'>Change Background Color</button>"
            + "</body>";

    @Override
    public void start(Stage stage) {

        Button button = new Button("Execute Javascript (Call from JavaFX)");

        final WebView webView = new WebView();
        final WebEngine webEngine = webView.getEngine();

        webEngine.setJavaScriptEnabled(true);

        webEngine.loadContent(HTML_STRING);

        button.setOnAction((ActionEvent e) -> {
            webEngine.executeScript("changeBackgroundColor();");
        });

        VBox root = new VBox();
        root.setPadding(new Insets(5));
        root.setSpacing(5);

        root.getChildren().addAll(button, webView);

        Scene scene = new Scene(root, 600, 500);

        stage.setTitle("JavaFX Hyperlink & WebView");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
