package _02_Tools_Basic._07_RadioButton._01_Object_RadioButton;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        RadioButton radioButton = new RadioButton("RadioButton");

        radioButton.setTranslateX(155);
        radioButton.setTranslateY(105);

        Group root = new Group();

        root.getChildren().add(radioButton);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX RadioButton");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
