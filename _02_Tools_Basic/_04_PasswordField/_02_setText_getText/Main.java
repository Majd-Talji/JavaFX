package _02_Tools_Basic._04_PasswordField._02_setText_getText;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label label_1 = new Label("Password");
        PasswordField passwordField = new PasswordField();
        Button button = new Button("Get Text");
        Label label_2 = new Label();

        label_1.setTranslateX(90);
        label_1.setTranslateY(83);
        passwordField.setTranslateX(160);
        passwordField.setTranslateY(80);
        button.setTranslateX(88);
        button.setTranslateY(157);
        label_2.setTranslateX(160);
        label_2.setTranslateY(160);

        Group root = new Group();

        root.getChildren().add(label_1);
        root.getChildren().add(passwordField);
        root.getChildren().add(button);
        root.getChildren().add(label_2);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX PasswordField");

        stage.setScene(scene);

        stage.show();
        
        button.setOnAction((ActionEvent e) -> {
            label_2.setText(passwordField.getText());
        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
