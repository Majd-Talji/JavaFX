package _02_Tools_Basic._18_Hyperlink_Webview._05_Load_WebPage_HTMLString_HTMLFile;

import java.io.File;
import java.net.URL;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Button buttonURL = new Button("Load Page https://eclipse.org");
        Button buttonHtmlString = new Button("Load HTML String");
        Button buttonHtmlFile = new Button("Load File ");

        final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();

        buttonURL.setOnAction((ActionEvent e) -> {
            String url = "https://eclipse.org";
            webEngine.load(url);
        });

        buttonHtmlString.setOnAction((ActionEvent e) -> {
            String html = "<html>"
                    + "<p>Prepared by a <b> Majd Talji</p><br><br>"
                    + "If you have any comments, ideas.. just let know<br><br>"
                    + "E-mail: en.majd.talji@gmail.com<br>"
                    + "twitter & facebook: @MajdTalji<br><br>"
                    + "<u>Note</u><br>"
                    + "I used JDK 1.8 to compile the source code.<br><br><br>"
                    + "</html>";
            webEngine.loadContent(html);
        });

        buttonHtmlFile.setOnAction((ActionEvent event) -> {
            try {
                File file = new File("C:/MyFiles/index.html");
                URL url = file.toURI().toURL();
                System.out.println("Local URL: " + url.toString());
                webEngine.load(url.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        VBox root = new VBox();
        root.setPadding(new Insets(5));
        root.setSpacing(5);

        HBox hBox = new HBox(5, buttonURL, buttonHtmlString, buttonHtmlFile);
        root.getChildren().addAll(hBox, browser);

        Scene scene = new Scene(root, 600, 500);

        stage.setTitle("JavaFX WebView");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
