package _02_Tools_Basic._06_ToggleButton._03_Events_Change_Status;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        ToggleButton toggleButton = new ToggleButton("Start");

        toggleButton.setTranslateX(120);
        toggleButton.setTranslateY(60);

        toggleButton.setPrefWidth(44);

        Group root = new Group();

        root.getChildren().add(toggleButton);

        Scene scene = new Scene(root, 280, 150);

        stage.setTitle("JavaFX ToggleButton");

        stage.setScene(scene);

        stage.show();

        toggleButton.setOnAction((ActionEvent e) -> {

            if (toggleButton.isSelected()) {
                toggleButton.setText("Stop");
            } else {
                toggleButton.setText("Start");
            }

        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
