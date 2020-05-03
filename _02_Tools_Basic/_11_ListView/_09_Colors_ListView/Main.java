package _02_Tools_Basic._11_ListView._09_Colors_ListView;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label();
        ListView<String> listView = new ListView();

        ObservableList<String> items = FXCollections.observableArrayList(
                "red", "blue", "green", "yellow", "orange", "brown", "pink", "purple", "gray", "black", "white"
        );

        listView.setItems(items);

        listView.setCellFactory((ListView<String> ol) -> new ColorRectCell());

        label.setPrefSize(200, 30);
        listView.setPrefSize(152, 250);

        label.setTranslateX(180);
        label.setTranslateY(110);
        listView.setTranslateX(0);
        listView.setTranslateY(0);

        label.setFont(new Font("Arial", 22));

        Group root = new Group();

        root.getChildren().add(label);
        root.getChildren().add(listView);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX ListView");

        stage.setScene(scene);

        stage.show();

        listView.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends String> ov, String oldValue, String newValue) -> {

            label.setText(newValue);

            label.setTextFill(Color.web(newValue));

        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
