package _04_Drawing_Coloring_Animation._04_Animations._01_Rotate_Transition;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
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

        Text text = new Text("Loading");

        text.setFont(new Font("Tahoma", 18));
        text.setFill(Color.WHITE);
        text.setStroke(Color.WHITE);

        Rectangle rectangle = new Rectangle();

        rectangle.setHeight(100);
        rectangle.setWidth(100);

        rectangle.setArcWidth(30);
        rectangle.setArcHeight(30);

        rectangle.setFill(Color.CADETBLUE);
        rectangle.setStroke(Color.BLACK);

        RotateTransition rotateTransition = new RotateTransition();

        rotateTransition.setDuration(Duration.seconds(1.5));

        rotateTransition.setNode(rectangle);

        rotateTransition.setByAngle(180);

        rotateTransition.setCycleCount(-1);

        rotateTransition.setAutoReverse(true);

        rotateTransition.play();

        StackPane root = new StackPane();

        root.getChildren().addAll(rectangle, text);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("Rotate Transition");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
