package _02_Tools_Basic._16_ProgressBar._02_Color_ProgressBar;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        ProgressBar progressBar = new ProgressBar();
        
        progressBar.setStyle("-fx-accent: red;");

        progressBar.setPrefSize(200, 20);

        progressBar.setTranslateX(100);
        progressBar.setTranslateY(110);

        Group root = new Group();

        root.getChildren().add(progressBar);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX ProgressBar");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
