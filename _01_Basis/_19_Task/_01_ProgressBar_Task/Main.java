package _01_Basis._19_Task._01_ProgressBar_Task;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

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

        Task task = new Task<Void>() {
            @Override
            protected Void call() {
                int max = 10_000;
                for (int i = 1; i <= max; i++) {
                    if (isCancelled()) {
                        break;
                    }
                    updateProgress(i, max);
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                }
                return null;
            }
        };

        progressBar.progressProperty().bind(task.progressProperty());
        new Thread(task).start();

        stage.setOnCloseRequest((event) -> {
            task.cancel();
        });

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
