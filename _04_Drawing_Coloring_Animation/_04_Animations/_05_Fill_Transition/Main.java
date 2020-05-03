package _04_Drawing_Coloring_Animation._04_Animations._05_Fill_Transition;

import javafx.animation.FillTransition;
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

        text.setFont(new Font("Tahoma", 60));
        text.setStroke(Color.GREY);

        FillTransition fillTransition = new FillTransition();

        fillTransition.setDuration(Duration.seconds(1.5));

        fillTransition.setShape(text);

        fillTransition.setFromValue(Color.CYAN);

        fillTransition.setToValue(Color.CORAL);

        fillTransition.setCycleCount(-1);

        fillTransition.setAutoReverse(true);

        fillTransition.play();

        StackPane root = new StackPane();

        root.getChildren().add(text);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("Fill Transition");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
