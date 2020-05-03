package _02_Tools_Basic._04_PasswordField._03_Strong_Password;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Password");
        PasswordField passwordField = new PasswordField();
        Label statusLabel = new Label();

        label.setTranslateX(90);
        label.setTranslateY(103);
        passwordField.setTranslateX(160);
        passwordField.setTranslateY(100);
        statusLabel.setTranslateX(160);
        statusLabel.setTranslateY(140);

        Group root = new Group();

        root.getChildren().add(label);
        root.getChildren().add(passwordField);
        root.getChildren().add(statusLabel);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX PasswordField");

        stage.setScene(scene);

        stage.show();
        
        passwordField.setOnKeyReleased((KeyEvent e) -> {
            
            if (passwordField.getText().length() == 0) {
                statusLabel.setText("");
            } else if (passwordField.getText().length() < 8) {
                statusLabel.setTextFill(Color.RED);
                statusLabel.setText("Weak Password");
            } else {
                statusLabel.setTextFill(Color.GREEN);
                statusLabel.setText("Strong Password");
            }
            
        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
