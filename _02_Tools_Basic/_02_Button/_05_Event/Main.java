package _02_Tools_Basic._02_Button._05_Event;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
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

        Button button = new Button("Put the mouse Over Me!");

        button.setTranslateX(90);
        button.setTranslateY(110);

        button.setFont(new Font("Arial", 18));

        Group root = new Group();

        root.getChildren().add(button);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX Button");

        stage.setScene(scene);

        stage.show();

        DropShadow shadow = new DropShadow(10, Color.RED);

        button.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
            button.setEffect(shadow);
        });

        button.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
            button.setEffect(null);
        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
