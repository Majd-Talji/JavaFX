package _02_Tools_Basic._24_ContextMenu._02_ContextMenu_In_TextArea;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        TextArea textArea = new TextArea();

        ContextMenu contextMenu = new ContextMenu();

        MenuItem cut = new MenuItem("Cut");
        MenuItem copy = new MenuItem("Copy");
        MenuItem paste = new MenuItem("Paste");
        MenuItem selectAll = new MenuItem("Select All");

        contextMenu.getItems().add(cut);
        contextMenu.getItems().add(copy);
        contextMenu.getItems().add(paste);
        contextMenu.getItems().add(new SeparatorMenuItem());
        contextMenu.getItems().add(selectAll);

        textArea.setContextMenu(contextMenu);

        textArea.setTranslateX(0);
        textArea.setTranslateY(0);

        textArea.setPrefSize(500, 400);

        Group root = new Group();

        root.getChildren().add(textArea);

        Scene scene = new Scene(root);

        stage.setTitle("JavaFX  ContextMenu");

        stage.setScene(scene);

        stage.show();

        textArea.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {

            if (e.getButton() == MouseButton.SECONDARY) {
                contextMenu.show(textArea, e.getScreenX(), e.getScreenY());
            }

        });

        cut.setOnAction((ActionEvent event) -> {
            textArea.cut();
        });

        copy.setOnAction((ActionEvent event) -> {
            textArea.copy();
        });
        
        paste.setOnAction((ActionEvent event) -> {
            textArea.paste();
        });
        
        selectAll.setOnAction((ActionEvent event) -> {
            textArea.selectAll();
        });
        
    }

    public static void main(String[] args) {
        launch(args);
    }

}
