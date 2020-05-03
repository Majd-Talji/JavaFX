package _02_Tools_Basic._16_ProgressBar._04_Password_Strength;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label label1 = new Label("Password");
        Label label2 = new Label("Strength");

        PasswordField passwordField = new PasswordField();

        ProgressBar progressBar = new ProgressBar(0);
        System.out.println(progressBar.getProgress());

        progressBar.setStyle("-fx-text-box-border: transparent;");

        label1.setPrefSize(60, 30);
        label2.setPrefSize(60, 30);
        progressBar.setPrefSize(200, 30);
        passwordField.setPrefSize(200, 10);

        label1.setTranslateX(60);
        label1.setTranslateY(90);
        label2.setTranslateX(60);
        label2.setTranslateY(135);
        passwordField.setTranslateX(120);
        passwordField.setTranslateY(90);
        progressBar.setTranslateX(120);
        progressBar.setTranslateY(142);

        Group root = new Group();

        root.getChildren().add(label1);
        root.getChildren().add(label2);
        root.getChildren().add(passwordField);
        root.getChildren().add(progressBar);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX ProgressBar");

        stage.setScene(scene);

        stage.show();

        passwordField.setOnKeyReleased((KeyEvent e) -> {

            double passLength = passwordField.getText().length();

            progressBar.setProgress(passLength / 10);
            
            if (passLength < 5) {
                progressBar.setStyle("-fx-accent: red; -fx-text-box-border: transparent;");
            } else if (passLength >= 5 && passLength < 8) {
                progressBar.setStyle("-fx-accent: yellow; -fx-text-box-border: transparent;");
            } else if (passLength >= 8) {
                progressBar.setStyle("-fx-accent: green; -fx-text-box-border: transparent;");
            } 

        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
