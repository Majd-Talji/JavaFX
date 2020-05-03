package _01_Basis._18_Timerline._02_Timeline._01_Descending_Value_From_Spinner;

import java.util.Optional;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    int delay = 0;
    Label label = new Label();
    Button btn = new Button("Show message");
    Timeline time;

    @Override
    public void start(Stage primaryStage) {
        HBox root = new HBox(10);
        root.setPadding(new Insets(10));

        Spinner spinner = new Spinner(1, 60, 5);
        spinner.setPrefWidth(80);

        btn.setOnAction((event) -> {
            delay = (int) spinner.getValue();

            String context;

            if (delay == 1) {
                context = "1 second has elapsed";
            } else {
                context = String.format("%d seconds has elapsed", delay);
            }

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information dialog");
            alert.setHeaderText("Time elapsed information");
            alert.setContentText(context);

            label.setText(context);

            alert.getButtonTypes().clear();
            alert.getButtonTypes().addAll(ButtonType.OK, new ButtonType(ButtonType.CANCEL.getText(), ButtonBar.ButtonData.CANCEL_CLOSE));

            Optional<ButtonType> option = alert.showAndWait();

            if (option.get().equals(ButtonType.OK)) {
                time = new Timeline();

                time.setCycleCount(Timeline.INDEFINITE);

                if (time != null) {
                    time.stop();
                }

                time.getKeyFrames().add(new MyKeyFrame().frame);
                time.playFromStart();

                btn.setDisable(true);
            } else if (option.get().equals(ButtonType.CANCEL)) {
            } else if (option.get().getButtonData().equals(ButtonBar.ButtonData.CANCEL_CLOSE)) {
            }
        });

        root.getChildren().add(spinner);
        root.getChildren().add(btn);
        root.getChildren().add(label);

        Scene scene = new Scene(root, 450, 45);

        primaryStage.setTitle("Timer");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

    class MyKeyFrame {

        KeyFrame frame = new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                String context;

                if (delay == 1) {
                    context = "1 second has elapsed";
                } else {
                    context = String.format("%d seconds has elapsed", delay);
                }

                label.setText(context);

                if (delay == 0) {
                    time.stop();
                    btn.setDisable(false);
                }

                delay--;

            }
        }
        );

    }

}
