package _04_Drawing_Coloring_Animation._04_Animations._03_Translate_Transition;

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

        text.setFont(new Font("Tahoma", 30));
        text.setFill(Color.RED);
        text.setStroke(Color.BLACK);
        
        StackPane.setMargin(text, new Insets(-80, 0, 0, 0));

        TranslateTransition translateTransition = new TranslateTransition();

        translateTransition.setDuration(Duration.seconds(0.8));

        translateTransition.setNode(text);

        translateTransition.setByY(80);

        translateTransition.setCycleCount(-1);

        translateTransition.setAutoReverse(true);

        translateTransition.play();

        StackPane root = new StackPane();

        root.getChildren().add(text);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("Translate Transition");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
