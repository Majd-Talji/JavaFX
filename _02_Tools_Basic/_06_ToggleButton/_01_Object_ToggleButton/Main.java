package _02_Tools_Basic._06_ToggleButton._01_Object_ToggleButton;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        ToggleButton toggleButton = new ToggleButton("ToggleButton");

        toggleButton.setTranslateX(145);
        toggleButton.setTranslateY(100);

        toggleButton.setPrefSize(110, 40);

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
