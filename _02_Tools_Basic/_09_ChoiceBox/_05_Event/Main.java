package _02_Tools_Basic._09_ChoiceBox._05_Event;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        ChoiceBox choiceBox = new ChoiceBox();
        Label label = new Label();

        choiceBox.getItems().addAll("English", "Français", "العربية", "Deutsch");

        String[] greetings = {"Hello", "Salut", "مرحبا", "Hallo"};

        label.setFont(new Font("Tahoma", 24));

        choiceBox.setPrefSize(100, 30);
        label.setPrefSize(100, 30);

        choiceBox.setTranslateX(100);
        choiceBox.setTranslateY(100);
        label.setTranslateX(230);
        label.setTranslateY(100);

        Group root = new Group();

        root.getChildren().add(choiceBox);
        root.getChildren().add(label);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX ChoiceBox");

        stage.setScene(scene);

        stage.show();

        choiceBox.getSelectionModel().selectedIndexProperty().addListener((ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
            
            label.setText(greetings[new_val.intValue()]);
            
        });

        choiceBox.getSelectionModel().selectFirst();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
