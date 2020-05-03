package _03_Layout._02_Pane._01_Object_Pane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Pane root = new Pane();

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        root.getChildren().add(button1);
        root.getChildren().add(button2);
        root.getChildren().add(button3);

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("JavaFX Pane");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
