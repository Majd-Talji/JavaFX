package _02_Tools_Basic._11_ListView._03_Event_SelectedValue;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Selected color: ");
        ListView<String> listView = new ListView();

        ObservableList<String> items = FXCollections.observableArrayList(
                "Red", "Blue", "Green", "Yellow", "Orage", "Brown", "Pink", "Purple", "Gray", "Black", "White"
        );

        listView.setItems(items);

        label.setPrefSize(200, 30);
        listView.setPrefSize(120, 250);

        label.setTranslateX(150);
        label.setTranslateY(110);
        listView.setTranslateX(0);
        listView.setTranslateY(0);

        Group root = new Group();

        root.getChildren().add(label);
        root.getChildren().add(listView);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX ListView");

        stage.setScene(scene);

        stage.show();

        listView.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends String> ov, String oldValue, String newValue) -> {

            label.setText("Selected color: " + newValue);

        });
        
        listView.getSelectionModel().select(0);

    }

    public static void main(String[] args) {
        launch(args);
    }

}
