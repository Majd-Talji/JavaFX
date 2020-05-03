package _04_Drawing_Coloring_Animation._01_Text._04_Linear_Gradient_Fill;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Text text = new Text("Majd Talji");

        text.setStyle(
                "-fx-font: 50px Tahoma;"
                + "-fx-fill: linear-gradient(from 0% 0% to 100% 200%, repeat, red 0%, purple 50%);"
                + "-fx-stroke: black;"
                + "-fx-stroke-width: 1.5;"
        );

        text.setX(45);
        text.setY(130);

        Group root = new Group();

        root.getChildren().add(text);

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("JavaFX Text");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
