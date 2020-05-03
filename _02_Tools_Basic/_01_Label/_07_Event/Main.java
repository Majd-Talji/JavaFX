package _02_Tools_Basic._01_Label._07_Event;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Put the mouse Over Me!");

        label.setTranslateX(120);
        label.setTranslateY(130);

        label.setFont(new Font("Arial", 24));

        Group root = new Group();

        root.getChildren().add(label);

        Scene scene = new Scene(root, 500, 300);

        stage.setTitle("JavaFX Label");

        stage.setScene(scene);

        stage.show();
        
        label.setOnMouseEntered((MouseEvent e) -> {
            label.setTextFill(Color.RED);
            label.setScaleX(1.2);
            label.setScaleY(1.2);
        });
        
        label.setOnMouseExited((MouseEvent e) -> {
            label.setTextFill(Color.BLACK);
            label.setScaleX(1);
            label.setScaleY(1);
        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
