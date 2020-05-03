package _04_Drawing_Coloring_Animation._04_Animations._04_Path_Transition;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
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

        text.setFont(new Font("Tahoma", 30));
        text.setFill(Color.RED);
        text.setStroke(Color.BLACK);

        Path path = new Path();
        MoveTo move = new MoveTo(200, 30);
        LineTo line1 = new LineTo(300, 125);
        LineTo line2 = new LineTo(200, 220);
        LineTo line3 = new LineTo(100, 125);
        LineTo line4 = new LineTo(200, 30);
        path.getElements().addAll(move, line1, line2, line3, line4);

        PathTransition pathTransition = new PathTransition();

        pathTransition.setDuration(Duration.seconds(2));

        pathTransition.setNode(text);

        pathTransition.setPath(path);

        pathTransition.setCycleCount(-1);

        pathTransition.setAutoReverse(true);

        pathTransition.play();

        Group root = new Group();

        root.getChildren().add(text);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("Path Transition");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
