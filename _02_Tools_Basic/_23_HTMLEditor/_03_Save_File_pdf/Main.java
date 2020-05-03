package _02_Tools_Basic._23_HTMLEditor._03_Save_File_pdf;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.print.PrinterJob;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.web.HTMLEditor;
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

        String initialText = "<html dir=\"ltr\">\n"
                + "    <head>\n"
                + "    </head>\n"
                + "    <body contenteditable=\"true\"> \n"
                + "        <p>\n"
                + "            <font face=\"Segoe UI\">Hello my name is \n"
                + "                <b>Majd Talji</b>. \n"
                + "            </font>\n"
                + "        </p>\n"
                + "    </body>\n"
                + "</html>";

        HTMLEditor htmlEditor = new HTMLEditor();
        Button button = new Button("Print Now");

        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();

        htmlEditor.setHtmlText(initialText);

        htmlEditor.setTranslateX(20);
        htmlEditor.setTranslateY(20);
        button.setTranslateX(245);
        button.setTranslateY(340);

        htmlEditor.setPrefSize(600, 300);
        button.setPrefSize(150, 30);

        Group root = new Group();

        root.getChildren().add(htmlEditor);
        root.getChildren().add(button);

        Scene scene = new Scene(root, 640, 390);

        stage.setTitle("JavaFX  HTML Editor");

        stage.setScene(scene);

        stage.show();

        button.setOnAction((ActionEvent event) -> {

            webEngine.loadContent(htmlEditor.getHtmlText());

            PrinterJob job = PrinterJob.createPrinterJob();

            if (job != null) {
                boolean sussess = job.printPage(webView);
                if (sussess) {
                    job.endJob();
                }
            }

        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
