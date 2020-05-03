package _01_Basis._19_Task._03_CopyTask;

import java.io.File;
import java.util.List;
import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    CopyTask copyTask;

    @Override
    public void start(Stage stage) {

        Label label = new Label("Copy files: ");
        ProgressBar progressBar = new ProgressBar(0);
        ProgressIndicator progressIndicator = new ProgressIndicator(0);

        Button startButton = new Button("Start");
        Button cancelButton = new Button("Cancel");

        Label statusLabel = new Label();
        statusLabel.setMinWidth(250);
        statusLabel.setTextFill(Color.BLUE);

        startButton.setOnAction((event) -> {
            startButton.setDisable(true);
            progressBar.setProgress(0);
            progressIndicator.setProgress(0);
            cancelButton.setDisable(false);

            copyTask = new CopyTask();

            progressBar.progressProperty().unbind();
            progressBar.progressProperty().bind(copyTask.progressProperty());

            progressIndicator.progressProperty().unbind();
            progressIndicator.progressProperty().bind(copyTask.progressProperty());

            statusLabel.textProperty().unbind();
            statusLabel.textProperty().bind(copyTask.messageProperty());

            copyTask.addEventHandler(WorkerStateEvent.WORKER_STATE_SUCCEEDED, new EventHandler<WorkerStateEvent>() {
                @Override
                public void handle(WorkerStateEvent event) {
                    List<File> copied = copyTask.getValue();
                    statusLabel.textProperty().unbind();
                    statusLabel.setText("Copied: " + copied.size());
                }
            });

            new Thread(copyTask).start();

        });

        cancelButton.setOnAction((event) -> {
            startButton.setDisable(false);
            cancelButton.setDisable(true);
            copyTask.cancel(true);
            progressBar.progressProperty().unbind();
            progressIndicator.progressProperty().unbind();
            statusLabel.textProperty().unbind();

            progressBar.setProgress(0);
            progressIndicator.setProgress(0);
        });

        FlowPane root = new FlowPane();
        root.setPadding(new Insets(10));
        root.setHgap(10);

        root.getChildren().add(label);
        root.getChildren().add(progressBar);
        root.getChildren().add(progressIndicator);
        root.getChildren().add(startButton);
        root.getChildren().add(cancelButton);
        root.getChildren().add(statusLabel);

        Scene scene = new Scene(root, 500, 120, Color.WHITE);
        stage.setTitle("Copy Files");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
