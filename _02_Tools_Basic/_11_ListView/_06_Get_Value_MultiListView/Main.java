package _02_Tools_Basic._11_ListView._06_Get_Value_MultiListView;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

        ListView<String> listView1 = new ListView();
        ListView<String> listView2 = new ListView();
        Button button = new Button("Get Selected Language and Levels");
        Label label1 = new Label("Select Language");
        Label label2 = new Label("Select Level(s)");
        Label labelResult = new Label();

        ObservableList<String> item1 = FXCollections.observableArrayList(
                "Java", "C", "C++", "C#", "VB"
        );

        ObservableList<String> item2 = FXCollections.observableArrayList(
                "Beginner", "Intermediate", "Advanced"
        );

        listView1.setItems(item1);
        listView2.setItems(item2);

        listView2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        labelResult.setAlignment(Pos.CENTER);

        listView1.setPrefSize(130, 120);
        listView2.setPrefSize(130, 120);
        button.setPrefSize(300, 30);
        label1.setPrefSize(150, 20);
        label2.setPrefSize(150, 20);
        labelResult.setPrefSize(400, 20);

        button.setTranslateX(50);
        button.setTranslateY(190);
        label1.setTranslateX(50);
        label1.setTranslateY(15);
        label2.setTranslateX(220);
        label2.setTranslateY(15);
        labelResult.setTranslateX(0);
        labelResult.setTranslateY(230);
        listView1.setTranslateX(50);
        listView1.setTranslateY(45);
        listView2.setTranslateX(220);
        listView2.setTranslateY(45);

        Group root = new Group();

        root.getChildren().add(listView1);
        root.getChildren().add(listView2);
        root.getChildren().add(button);
        root.getChildren().add(label1);
        root.getChildren().add(label2);
        root.getChildren().add(labelResult);

        Scene scene = new Scene(root, 400, 280);

        stage.setTitle("JavaFX ListView");

        stage.setScene(scene);

        stage.show();

        button.setOnAction((ActionEvent e) -> {

            if (listView1.getSelectionModel().isEmpty()) {
                labelResult.setText("Please select a language first!");
            } else if (listView2.getSelectionModel().isEmpty()) {
                labelResult.setText("Please select at least one level!");
            } else {
                labelResult.setText("Language = "
                        + listView1.getSelectionModel().getSelectedItem()
                        + "       Levels = "
                        + listView2.getSelectionModel().getSelectedItems()
                );
            }

        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
