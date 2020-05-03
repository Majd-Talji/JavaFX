package _02_Tools_Basic._11_ListView._05_Get_Values_Multiselected;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label totalSelected = new Label("Total Selected: ");
        Label selectedItems = new Label("Selected color: ");
        ListView<String> listView = new ListView();

        ObservableList<String> items = FXCollections.observableArrayList(
                "Red", "Blue", "Green", "Yellow", "Orage", "Brown", "Pink", "Purple", "Gray", "Black", "White"
        );

        listView.setItems(items);

        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        totalSelected.setPrefSize(250, 30);
        selectedItems.setPrefSize(250, 30);
        listView.setPrefSize(120, 250);

        totalSelected.setTranslateX(150);
        totalSelected.setTranslateY(90);
        selectedItems.setTranslateX(150);
        selectedItems.setTranslateY(120);
        listView.setTranslateX(0);
        listView.setTranslateY(0);

        Group root = new Group();

        root.getChildren().add(totalSelected);
        root.getChildren().add(selectedItems);
        root.getChildren().add(listView);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX ListView");

        stage.setScene(scene);

        stage.show();

        listView.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends String> ov, String oldValue, String newValue) -> {

            totalSelected.setText("Total selected: " + listView.getSelectionModel().getSelectedItems().size());
            selectedItems.setText("Selected colors: " + listView.getSelectionModel().getSelectedItems());

        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
