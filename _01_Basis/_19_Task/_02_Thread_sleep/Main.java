package _01_Basis._19_Task._02_Thread_sleep;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    TextArea textArea = new TextArea();
    Label statusLabel = new Label("Not Started...");
    Button startButton = new Button("Start");
    Button exitButton = new Button("Exit");

    @Override
    public void start(Stage stage) {

        startButton.setOnAction((event) -> {
            startTask();
        });

        exitButton.setOnAction((event) -> {
            stage.close();
        });

        HBox buttonBox = new HBox(5, startButton, exitButton);

        VBox root = new VBox(10, statusLabel, buttonBox, textArea);

        root.setStyle("-fx-padding: 10;"
                + "-fx-border-style: solid inside;"
                + "-fx-border-width: 2;"
                + "-fx-border-insets: 5;"
                + "-fx-border-radius: 5;"
                + "-fx-border-color: blue;");

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("JavaFX Thread.sleep");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

    private void runTask() {
        for (int i = 0; i <= 10; i++) {
            try {
                String status = "Processing " + i + " of " + 10;

                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        statusLabel.setText(status);
                    }
                });

                textArea.appendText(status + "\n");
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void startTask() {
        Runnable task = new Runnable() {
            public void run() {
                runTask();
            }
        };

        Thread backgroundThread = new Thread(task);
        backgroundThread.setDaemon(true);
        backgroundThread.start();
    }

}
