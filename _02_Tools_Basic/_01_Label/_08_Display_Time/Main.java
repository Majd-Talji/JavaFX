package _02_Tools_Basic._01_Label._08_Display_Time;

import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    static Label timeLabel = new Label("");

    @Override
    public void start(Stage stage) {

        Font newFont = new Font("Arial", 20);

        timeLabel.setFont(newFont);
        timeLabel.setTextFill(Color.BLUE);

        StackPane root = new StackPane();

        root.getChildren().add(timeLabel);

        Scene scene = new Scene(root, 350, 70);

        stage.setTitle("Display Time");

        stage.setScene(scene);

        stage.show();

        doTime();

    }

    public void doTime() {

        Timeline time = new Timeline();
        time.setCycleCount(Timeline.INDEFINITE);

        KeyFrame frame = new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss: a");
                String d = sdf.format(date).toString();
                timeLabel.setText(d);
            }
        });

        time.getKeyFrames().add(frame);
        time.playFromStart();

    }

    ;

    public static void main(String[] args) {
        launch(args);
    }

}
