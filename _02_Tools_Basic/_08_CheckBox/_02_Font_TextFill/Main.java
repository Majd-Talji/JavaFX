package _02_Tools_Basic._08_CheckBox._02_Font_TextFill;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
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

        CheckBox checkBox1 = new CheckBox("Red");
        CheckBox checkBox2 = new CheckBox("Blue");
        CheckBox checkBox3 = new CheckBox("Green");

        checkBox1.setTranslateX(50);
        checkBox1.setTranslateY(50);

        checkBox2.setTranslateX(50);
        checkBox2.setTranslateY(90);

        checkBox3.setTranslateX(50);
        checkBox3.setTranslateY(130);

        Font newFont = new Font("Arial", 18);

        checkBox1.setFont(newFont);
        checkBox2.setFont(newFont);
        checkBox3.setFont(newFont);

        checkBox1.setTextFill(Color.RED);
        checkBox2.setTextFill(Color.BLUE);
        checkBox3.setTextFill(Color.GREEN);

        Group root = new Group();

        root.getChildren().add(checkBox1);
        root.getChildren().add(checkBox2);
        root.getChildren().add(checkBox3);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX CheckBox");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
