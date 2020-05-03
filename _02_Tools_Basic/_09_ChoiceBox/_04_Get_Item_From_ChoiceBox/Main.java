package _02_Tools_Basic._09_ChoiceBox._04_Get_Item_From_ChoiceBox;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        ChoiceBox choiceBox = new ChoiceBox();
        Button button = new Button("Get Selected Car");
        Label label = new Label();

        choiceBox.getItems().addAll("Ferrari", "Mercedes", "Camarro", "Nissan", "Mazda");

        choiceBox.setPrefSize(120, 30);
        button.setPrefSize(120, 30);
        label.setPrefSize(120, 30);

        choiceBox.setTranslateX(140);
        choiceBox.setTranslateY(70);
        button.setTranslateX(140);
        button.setTranslateY(115);
        label.setTranslateX(140);
        label.setTranslateY(160);

        Group root = new Group();

        root.getChildren().add(choiceBox);
        root.getChildren().add(button);
        root.getChildren().add(label);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX ChoiceBox");

        stage.setScene(scene);

        stage.show();

        button.setOnAction((ActionEvent e) -> {

            if (choiceBox.getSelectionModel().isEmpty()) {
                label.setText("No car selected!");
            } else {
                label.setText(choiceBox.getSelectionModel().getSelectedItem().toString());
            }

        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
