package _02_Tools_Basic._11_ListView._08_Editable_Items;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        ListView listView = new ListView();

        ObservableList<String> items = FXCollections.observableArrayList(
                "click ENTER or double click to change the text",
                "click ENTER or double click to change the text",
                "click ENTER or double click to change the text",
                "click ENTER or double click to change the text",
                "click ENTER or double click to change the text",
                "click ENTER or double click to change the text",
                "click ENTER or double click to change the text",
                "click ENTER or double click to change the text",
                "click ENTER or double click to change the text",
                "click ENTER or double click to change the text"
        );

        listView.setItems(items);

        listView.setEditable(true);

        listView.setCellFactory(TextFieldListCell.forListView());

        listView.setPrefSize(300, 190);

        listView.setTranslateX(50);
        listView.setTranslateY(30);

        Group root = new Group();

        root.getChildren().add(listView);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX ListView");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
