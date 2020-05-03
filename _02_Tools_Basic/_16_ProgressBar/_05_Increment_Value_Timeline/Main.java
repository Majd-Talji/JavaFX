package _02_Tools_Basic._16_ProgressBar._05_Increment_Value_Timeline;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.util.Duration;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        ProgressBar progressBar = new ProgressBar(0);
        progressBar.setPrefSize(200, 35);

        progressBar.setStyle("-fx-accent: red; "
                + "-fx-text-box-border: transparent;");
        
        Timeline time = new Timeline();
        time.setCycleCount(Timeline.INDEFINITE);

        time.getKeyFrames().add(new KeyFrame(Duration.millis(500), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                progressBar.setProgress(progressBar.getProgress() + 0.1);
                if (((int)progressBar.getProgress()) == 1) {
                    time.stop();
                }
            }
        }));

        time.playFromStart();

        StackPane root = new StackPane();

        root.getChildren().add(progressBar);

        Scene scene = new Scene(root, 300, 150);

        stage.setTitle("JavaFX ProgressBar");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
