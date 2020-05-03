package _02_Tools_Basic._10_ComboBox._04_Get_Item_From_ComboBox;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main1 extends Application {

    @Override
    public void start(Stage stage) {

        ComboBox comboBox = new ComboBox();
        Button button = new Button("Get Selected Car");
        Label label = new Label();

        comboBox.getItems().addAll("Ferrari", "Mercedes", "Camarro", "Nissan", "Mazda");

        comboBox.setPrefSize(120, 30);
        button.setPrefSize(120, 30);
        label.setPrefSize(120, 30);

        comboBox.setTranslateX(140);
        comboBox.setTranslateY(70);
        button.setTranslateX(140);
        button.setTranslateY(115);
        label.setTranslateX(140);
        label.setTranslateY(160);

        Group root = new Group();

        root.getChildren().add(comboBox);
        root.getChildren().add(button);
        root.getChildren().add(label);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX ComboBox");

        stage.setScene(scene);

        stage.show();

        button.setOnAction((ActionEvent e) -> {

            if (comboBox.getSelectionModel().isEmpty()) {
                label.setText("No car selected!");
            } else {
                label.setText(comboBox.getSelectionModel().getSelectedItem().toString());
            }

        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
