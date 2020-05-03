package _02_Tools_Basic._07_RadioButton._03_ToggleGroup;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Select your language");
        RadioButton radioButton1 = new RadioButton("Arabic");
        RadioButton radioButton2 = new RadioButton("Englich");
        RadioButton radioButton3 = new RadioButton("German");
        
        label.setTranslateX(40);
        label.setTranslateY(50);

        radioButton1.setTranslateX(40);
        radioButton1.setTranslateY(80);

        radioButton2.setTranslateX(40);
        radioButton2.setTranslateY(110);

        radioButton3.setTranslateX(40);
        radioButton3.setTranslateY(140);

        ToggleGroup group = new ToggleGroup();
        radioButton1.setToggleGroup(group);
        radioButton2.setToggleGroup(group);
        radioButton3.setToggleGroup(group);

        Group root = new Group();

        root.getChildren().add(label);
        root.getChildren().add(radioButton1);
        root.getChildren().add(radioButton2);
        root.getChildren().add(radioButton3);

        Scene scene = new Scene(root, 400, 220);

        stage.setTitle("JavaFX RadioButton");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
