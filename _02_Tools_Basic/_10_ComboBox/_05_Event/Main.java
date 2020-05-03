package _02_Tools_Basic._10_ComboBox._05_Event;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
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

        ComboBox comboBox = new ComboBox();
        Label label = new Label();

        comboBox.getItems().addAll("English", "Français", "العربية", "Deutsch");

        String[] greetings = {"Hello", "Salut", "مرحبا", "Hallo"};

        label.setFont(new Font("Tahoma", 24));

        comboBox.setPrefSize(100, 30);
        label.setPrefSize(100, 30);

        comboBox.setTranslateX(100);
        comboBox.setTranslateY(100);
        label.setTranslateX(230);
        label.setTranslateY(100);

        Group root = new Group();

        root.getChildren().add(comboBox);
        root.getChildren().add(label);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX ChoiceBox");

        stage.setScene(scene);

        stage.show();

        comboBox.getSelectionModel().selectedIndexProperty().addListener((ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
            
            label.setText(greetings[new_val.intValue()]);
            
        });

        comboBox.getSelectionModel().selectFirst();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
