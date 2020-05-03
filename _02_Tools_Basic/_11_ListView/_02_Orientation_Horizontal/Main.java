package _02_Tools_Basic._11_ListView._02_Orientation_Horizontal;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        ListView<String> listView = new ListView();

        ObservableList<String> items = FXCollections.observableArrayList(
                "Red", "Blue", "Green", "Yellow", "Orage", "Brown", "Pink", "Purple", "Gray", "Black", "White"
        );

        listView.setItems(items);

        listView.setOrientation(Orientation.HORIZONTAL);

        listView.setPrefSize(300, 50);

        listView.setTranslateX(50);
        listView.setTranslateY(100);

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
