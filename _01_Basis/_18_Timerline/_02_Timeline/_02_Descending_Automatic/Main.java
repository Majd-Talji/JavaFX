package _01_Basis._18_Timerline._02_Timeline._02_Descending_Automatic;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    private final Integer startTime = 10;
    private Integer seconds = startTime;
    private Label label;

    @Override
    public void start(Stage windows) throws Exception {
        label = new Label();
        label.setTextFill(Color.ORANGE);
        label.setFont(Font.font(20));

        HBox layout = new HBox(5);
        layout.getChildren().add(label);

        doTime();

        Group root = new Group();
        root.getChildren().add(layout);
        root.setLayoutX(60);
        Scene scene = new Scene(root, 300, 70, Color.BLACK);

        windows.setScene(scene);
        windows.setTitle("Count down Timer");
        windows.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void doTime() {

        Timeline time = new Timeline();
        time.setCycleCount(Timeline.INDEFINITE);

        if (time != null) {
            time.stop();
        }

        KeyFrame frame = new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                seconds--;
                label.setText("Countdown: " + seconds.toString());

                if (seconds <= 0) {
                    time.stop();
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText("Count down reset to 0!");
                    alert.show();
                }

            }
        }
        );

        time.getKeyFrames().add(frame);
        time.playFromStart();

    }

}
