package _02_Tools_Basic._23_HTMLEditor._02_HTMLEditor_WebView_TextArea;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
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
                + "        <p>\n"
                + "            <font face=\"Segoe UI\">I am \n"
                + "                <font color=\"#cc3333\"><b>29</b></font>\n"
                + "                years old.\n"
                + "            </font>\n"
                + "            <span style=\"font-family: 'Segoe UI'\">I started programming at</span>\n"
                + "            <b style=\"font-family: 'Segoe UI'\">\n"
                + "                <font color=\"#cc3333\">19</font>\n"
                + "            </b>\n"
                + "            <span style=\"font-family: 'Segoe UI'\">.</span>\n"
                + "        </p>\n"
                + "        <p>\n"
                + "            <span style=\"font-family: 'Segoe UI'\">\n"
                + "                <b>I code  using the following languages inmy work:</b>\n"
                + "            </span>\n"
                + "        </p>\n"
                + "        <p></p>\n"
                + "        <ul>\n"
                + "            <li><font face=\"Segoe UI\">C# for Backend and desktop apps.</font></li>\n"
                + "            <li><font face=\"Segoe UI\">HTML, CSS, JS, JQuery, Bootstrap, TypeScript for Frontend.</font></li>\n"
                + "        </ul>\n"
                + "        <p>\n"
                + "            <font face=\"Segoe UI\"><b>Also, I use the following frameworks:</b></font>\n"
                + "        </p>\n"
                + "        <p></p>\n"
                + "        <p>\n"
                + "            <p></p>\n"
                + "            <p></p>\n"
                + "            <p></p>\n"
                + "        </p>\n"
                + "        <ul>\n"
                + "            <li><font face=\"Segoe UI\">Angular</font></li>\n"
                + "            <li><font face=\"Segoe UI\">lonic</font></li>\n"
                + "        </ul>\n"
                + "    </body>\n"
                + "</html>";

        HTMLEditor htmlEditor = new HTMLEditor();
        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();
        TextArea textArea = new TextArea();
        ToggleButton buttonViewEditor = new ToggleButton("View the Editor");
        ToggleButton buttonPreview = new ToggleButton("View in Browser");
        ToggleButton buttonViewCode = new ToggleButton("View HTML Code");

        htmlEditor.setHtmlText(initialText);

        textArea.setEditable(false);
        textArea.setWrapText(true);

        htmlEditor.setVisible(false);
        webView.setVisible(true);
        textArea.setVisible(false);

        ToggleGroup toggleGroup = new ToggleGroup();
        buttonViewEditor.setToggleGroup(toggleGroup);
        buttonPreview.setToggleGroup(toggleGroup);
        buttonViewCode.setToggleGroup(toggleGroup);

        htmlEditor.setTranslateX(20);
        htmlEditor.setTranslateY(20);
        webView.setTranslateX(20);
        webView.setTranslateY(20);
        textArea.setTranslateX(20);
        textArea.setTranslateY(20);
        buttonViewEditor.setTranslateX(85);
        buttonViewEditor.setTranslateY(340);
        buttonPreview.setTranslateX(245);
        buttonPreview.setTranslateY(340);
        buttonViewCode.setTranslateX(405);
        buttonViewCode.setTranslateY(340);

        htmlEditor.setPrefSize(600, 300);
        webView.setPrefSize(600, 300);
        textArea.setPrefSize(600, 300);
        buttonViewEditor.setPrefSize(150, 30);
        buttonPreview.setPrefSize(150, 30);
        buttonViewCode.setPrefSize(150, 30);

        Group root = new Group();

        root.getChildren().add(htmlEditor);
        root.getChildren().add(buttonViewEditor);
        root.getChildren().add(webView);
        root.getChildren().add(textArea);
        root.getChildren().add(buttonPreview);
        root.getChildren().add(buttonViewCode);

        Scene scene = new Scene(root, 640, 390);

        stage.setTitle("JavaFX  HTML Editor");

        stage.setScene(scene);

        stage.show();

        toggleGroup.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) -> {

            if (toggleGroup.getSelectedToggle().equals(buttonViewEditor)) {
                textArea.setVisible(false);
                webView.setVisible(false);
                htmlEditor.setVisible(true);
            } else if (toggleGroup.getSelectedToggle().equals(buttonPreview)) {
                webEngine.loadContent(htmlEditor.getHtmlText());
                textArea.setVisible(false);
                htmlEditor.setVisible(false);
                webView.setVisible(true);
            } else if (toggleGroup.getSelectedToggle().equals(buttonViewCode)) {
                textArea.setText(htmlEditor.getHtmlText());
                htmlEditor.setVisible(false);
                webView.setVisible(false);
                textArea.setVisible(true);
            }

        });

        buttonViewEditor.setSelected(true);

    }

    public static void main(String[] args) {
        launch(args);
    }

}
