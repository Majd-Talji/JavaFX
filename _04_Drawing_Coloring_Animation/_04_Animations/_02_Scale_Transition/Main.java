package _04_Drawing_Coloring_Animation._04_Animations._02_Scale_Transition;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Text text = new Text("Majd Talji");

        text.setFont(new Font("Tahoma", 25));
        text.setFill(Color.RED);
        text.setStroke(Color.BLACK);

        ScaleTransition scaleTransition = new ScaleTransition();

        scaleTransition.setDuration(Duration.seconds(1));

        scaleTransition.setNode(text);

        scaleTransition.setByX(1.5);
        scaleTransition.setByY(1.5);

        scaleTransition.setCycleCount(-1);

        scaleTransition.setAutoReverse(true);

        scaleTransition.play();

        StackPane root = new StackPane();

        root.getChildren().add(text);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("Scale Transition");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
