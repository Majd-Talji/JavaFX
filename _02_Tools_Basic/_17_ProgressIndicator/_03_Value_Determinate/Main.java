package _02_Tools_Basic._17_ProgressIndicator._03_Value_Determinate;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        ProgressIndicator progressIndicator1 = new ProgressIndicator(0.0);
        ProgressIndicator progressIndicator2 = new ProgressIndicator(0.25);
        ProgressIndicator progressIndicator3 = new ProgressIndicator(0.5);
        ProgressIndicator progressIndicator4 = new ProgressIndicator(0.75);
        ProgressIndicator progressIndicator5 = new ProgressIndicator(1.0);

        progressIndicator2.setStyle("-fx-accent: red;");
        progressIndicator3.setStyle("-fx-accent: orange;");
        progressIndicator4.setStyle("-fx-accent: yellow;");
        progressIndicator5.setStyle("-fx-accent: green;");

        progressIndicator1.setPrefSize(50, 50);
        progressIndicator2.setPrefSize(50, 50);
        progressIndicator3.setPrefSize(50, 50);
        progressIndicator4.setPrefSize(50, 50);
        progressIndicator5.setPrefSize(50, 50);

        progressIndicator1.setTranslateX(50);
        progressIndicator1.setTranslateY(100);
        progressIndicator2.setTranslateX(110);
        progressIndicator2.setTranslateY(100);
        progressIndicator3.setTranslateX(170);
        progressIndicator3.setTranslateY(100);
        progressIndicator4.setTranslateX(230);
        progressIndicator4.setTranslateY(100);
        progressIndicator5.setTranslateX(290);
        progressIndicator5.setTranslateY(100);

        Group root = new Group();

        root.getChildren().add(progressIndicator1);
        root.getChildren().add(progressIndicator2);
        root.getChildren().add(progressIndicator3);
        root.getChildren().add(progressIndicator4);
        root.getChildren().add(progressIndicator5);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX ProgressIndicator");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
