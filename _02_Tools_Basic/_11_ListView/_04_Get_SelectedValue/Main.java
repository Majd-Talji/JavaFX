package _02_Tools_Basic._11_ListView._04_Get_SelectedValue;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

        Button button = new Button("Get Selected color: ");
        Label label = new Label();
        ListView<String> listView = new ListView();

        ObservableList<String> items = FXCollections.observableArrayList(
                "Red", "Blue", "Green", "Yellow", "Orage", "Brown", "Pink", "Purple", "Gray", "Black", "White"
        );

        listView.setItems(items);

        button.setPrefSize(150, 30);
        label.setPrefSize(150, 30);
        listView.setPrefSize(120, 250);

        button.setTranslateX(150);
        button.setTranslateY(90);
        label.setTranslateX(150);
        label.setTranslateY(140);
        listView.setTranslateX(0);
        listView.setTranslateY(0);

        Group root = new Group();

        root.getChildren().add(button);
        root.getChildren().add(label);
        root.getChildren().add(listView);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX ListView");

        stage.setScene(scene);

        stage.show();

        button.setOnAction((ActionEvent e) -> {

            if (listView.getSelectionModel().isEmpty()) {
                label.setText("No color selected!");
            } else {
                label.setText("Selected color: " + listView.getSelectionModel().getSelectedItem());
            }

        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
