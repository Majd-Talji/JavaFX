package _02_Tools_Basic._16_ProgressBar._03_Value_Progress;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        ProgressBar progressBar1 = new ProgressBar(0.25);
        ProgressBar progressBar2 = new ProgressBar(0.5);
        ProgressBar progressBar3 = new ProgressBar(0.75);
        ProgressBar progressBar4 = new ProgressBar(1.0);

        Label label1 = new Label("25 %");
        Label label2 = new Label("50 %");
        Label label3 = new Label("75 %");
        Label label4 = new Label("100 %");

        progressBar1.setStyle("-fx-accent: red;");
        progressBar2.setStyle("-fx-accent: orange;");
        progressBar3.setStyle("-fx-accent: yellow;");
        progressBar4.setStyle("-fx-accent: green;");

        label1.setPrefSize(40, 20);
        label2.setPrefSize(40, 20);
        label3.setPrefSize(40, 20);
        label4.setPrefSize(40, 20);
        progressBar1.setPrefSize(200, 20);
        progressBar2.setPrefSize(200, 20);
        progressBar3.setPrefSize(200, 20);
        progressBar4.setPrefSize(200, 20);

        label1.setTranslateX(290);
        label1.setTranslateY(80);
        label2.setTranslateX(290);
        label2.setTranslateY(110);
        label3.setTranslateX(290);
        label3.setTranslateY(140);
        label4.setTranslateX(290);
        label4.setTranslateY(170);
        progressBar1.setTranslateX(80);
        progressBar1.setTranslateY(80);
        progressBar2.setTranslateX(80);
        progressBar2.setTranslateY(110);
        progressBar3.setTranslateX(80);
        progressBar3.setTranslateY(140);
        progressBar4.setTranslateX(80);
        progressBar4.setTranslateY(170);

        Group root = new Group();

        root.getChildren().add(progressBar1);
        root.getChildren().add(progressBar2);
        root.getChildren().add(progressBar3);
        root.getChildren().add(progressBar4);
        root.getChildren().add(label1);
        root.getChildren().add(label2);
        root.getChildren().add(label3);
        root.getChildren().add(label4);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX ProgressBar");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
