package _02_Tools_Basic._07_RadioButton._02_Font_TextFill;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
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

        RadioButton radioButton1 = new RadioButton("Red");
        RadioButton radioButton2 = new RadioButton("Blue");
        RadioButton radioButton3 = new RadioButton("Green");

        radioButton1.setTranslateX(50);
        radioButton1.setTranslateY(50);

        radioButton2.setTranslateX(50);
        radioButton2.setTranslateY(90);

        radioButton3.setTranslateX(50);
        radioButton3.setTranslateY(130);

        Font newFont = new Font("Arial", 18);

        radioButton1.setFont(newFont);
        radioButton2.setFont(newFont);
        radioButton3.setFont(newFont);

        radioButton1.setTextFill(Color.RED);
        radioButton2.setTextFill(Color.BLUE);
        radioButton3.setTextFill(Color.GREEN);

        ToggleGroup group = new ToggleGroup();
        radioButton1.setToggleGroup(group);
        radioButton2.setToggleGroup(group);
        radioButton3.setToggleGroup(group);

        Group root = new Group();

        root.getChildren().add(radioButton1);
        root.getChildren().add(radioButton2);
        root.getChildren().add(radioButton3);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX RadioButton");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
