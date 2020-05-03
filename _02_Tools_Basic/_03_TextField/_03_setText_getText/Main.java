package _02_Tools_Basic._03_TextField._03_setText_getText;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label nameLabel = new Label("Enter your name");
        TextField textField = new TextField();
        Button button = new Button("Get name");
        Label resultLabel = new Label();

        nameLabel.setTranslateX(50);
        nameLabel.setTranslateY(83);
        textField.setTranslateX(150);
        textField.setTranslateY(80);
        button.setTranslateX(50);
        button.setTranslateY(157);
        resultLabel.setTranslateX(150);
        resultLabel.setTranslateY(160);

        Group root = new Group();

        root.getChildren().add(nameLabel);
        root.getChildren().add(textField);
        root.getChildren().add(button);
        root.getChildren().add(resultLabel);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX TextField");

        stage.setScene(scene);

        stage.show();
        
        button.setOnAction((ActionEvent e) -> {
            resultLabel.setText(textField.getText());
        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
