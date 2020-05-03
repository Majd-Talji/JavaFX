package _04_Drawing_Coloring_Animation._04_Animations._06_Stroke_Transition;

import javafx.animation.StrokeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Circle circle = new Circle();

        circle.setRadius(50);

        circle.setFill(Color.RED);

        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(5);

        StrokeTransition strokeTransition = new StrokeTransition();

        strokeTransition.setDuration(Duration.seconds(0.5));

        strokeTransition.setShape(circle);

        strokeTransition.setFromValue(Color.BLACK);

        strokeTransition.setToValue(Color.TRANSPARENT);

        strokeTransition.setCycleCount(-1);

        strokeTransition.setAutoReverse(true);

        strokeTransition.play();

        StackPane root = new StackPane();

        root.getChildren().add(circle);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("Stroke Transition");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
