package _02_Tools_Basic._05_TextArea._04_getText;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label nameLabel = new Label("Enter your address");
        TextArea textArea = new TextArea();
        Button button = new Button("Get address");
        Label resultLabel = new Label();

        nameLabel.setTranslateX(50);
        nameLabel.setTranslateY(73);
        textArea.setTranslateX(170);
        textArea.setTranslateY(70);
        button.setTranslateX(50);
        button.setTranslateY(157);
        resultLabel.setTranslateX(170);
        resultLabel.setTranslateY(160);

        textArea.setPrefSize(170, 60);
        button.setPrefSize(100, 25);
        resultLabel.setPrefWidth(170);

        resultLabel.setWrapText(true);
        textArea.setWrapText(true);

        textArea.setPromptText("Street, and Apt. No.\n city, State, and ZIP+4");
        textArea.setFocusTraversable(false);

        Group root = new Group();

        root.getChildren().add(nameLabel);
        root.getChildren().add(textArea);
        root.getChildren().add(button);
        root.getChildren().add(resultLabel);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX TextArea");

        stage.setScene(scene);

        stage.show();

        button.setOnAction((ActionEvent e) -> {

            resultLabel.setText(textArea.getText());

        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
