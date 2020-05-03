package _02_Tools_Basic._06_ToggleButton._02_Font_TextFill;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
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

        ToggleButton toggleButton = new ToggleButton("ToggleButton");

        toggleButton.setTranslateX(135);
        toggleButton.setTranslateY(100);

        toggleButton.setFont(new Font("Arial", 18));
        
        toggleButton.setTextFill(Color.RED);

        Group root = new Group();

        root.getChildren().add(toggleButton);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX ToggleButton");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
