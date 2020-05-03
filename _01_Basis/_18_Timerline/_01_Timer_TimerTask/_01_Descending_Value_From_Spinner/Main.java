package _01_Basis._18_Timerline._01_Timer_TimerTask._01_Descending_Value_From_Spinner;

import java.util.Optional;
import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    int delay = 0;
    Label label = new Label();
    Button btn = new Button("Show message");

    @Override
    public void start(Stage primaryStage) {

        HBox root = new HBox(10);
        root.setPadding(new Insets(10));

        Timer timer = new Timer();

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
            alert.getButtonTypes().addAll(ButtonType.OK, new ButtonType(ButtonType.CANCEL.getText(), ButtonData.CANCEL_CLOSE));

            Optional<ButtonType> option = alert.showAndWait();

            if (option.get().equals(ButtonType.OK)) {
                timer.schedule(new MyTimerTask(), 0, 1000);
                btn.setDisable(true);
            } else if (option.get().equals(ButtonType.CANCEL)) {
            } else if (option.get().getButtonData().equals(ButtonData.CANCEL_CLOSE)) {
            }

        });

        root.getChildren().add(spinner);
        root.getChildren().add(btn);
        root.getChildren().add(label);
        Scene scene = new Scene(root, 450, 45);

        primaryStage.setOnCloseRequest((event) -> {
            timer.cancel();
        });

        primaryStage.setTitle("Timer");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

    class MyTimerTask extends TimerTask {

        @Override
        public void run() {

            Platform.runLater(() -> {

                String context;

                if (delay == 1) {
                    context = "1 second has elapsed";
                } else {
                    context = String.format("%d seconds has elapsed", delay);
                }

                label.setText(context);

                if (delay == 0) {
                    this.cancel();
                    btn.setDisable(false);
                }

                delay--;

            });

        }

    }

}
