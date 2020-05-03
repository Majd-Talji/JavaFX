package _04_Drawing_Coloring_Animation._04_Animations._07_Sequence_Transition;

import javafx.animation.RotateTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
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

        text.setFont(new Font("Tahoma", 60));
        text.setFill(Color.RED);
        text.setStroke(Color.BLACK);
        
        text.setRotate(30);
        
        StackPane.setMargin(text, new Insets(0, 0, 1000, 0));
        
        TranslateTransition translateTransition = new TranslateTransition();
        translateTransition.setDuration(Duration.seconds(2));
        translateTransition.setNode(text);
        translateTransition.setByY(500);
        translateTransition.setCycleCount(1);
        translateTransition.setAutoReverse(true);
        
        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setDuration(Duration.seconds(0.5));
        rotateTransition.setNode(text);
        rotateTransition.setByAngle(-30);
        rotateTransition.setCycleCount(1);
        rotateTransition.setAutoReverse(false);
        
        SequentialTransition sequentialTransition = new SequentialTransition(text, translateTransition, rotateTransition);

        sequentialTransition.play();
        
        StackPane root = new StackPane();

        root.getChildren().add(text);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("Sequence Transition");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
