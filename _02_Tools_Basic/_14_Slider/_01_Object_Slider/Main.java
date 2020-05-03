package _02_Tools_Basic._14_Slider._01_Object_Slider;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Slider slider = new Slider();

        slider.setTranslateX(100);
        slider.setTranslateY(100);

        slider.setPrefSize(200, 40);

        Group root = new Group();

        root.getChildren().add(slider);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX Slider");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
