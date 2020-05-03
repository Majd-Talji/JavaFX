package _02_Tools_Basic._17_ProgressIndicator._02_Color;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        ProgressIndicator progressIndicator = new ProgressIndicator();

        progressIndicator.setStyle("-fx-accent: red;");
        
        progressIndicator.setPrefSize(60, 60);

        progressIndicator.setTranslateX(170);
        progressIndicator.setTranslateY(95);

        Group root = new Group();

        root.getChildren().add(progressIndicator);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX ProgressIndicator");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
