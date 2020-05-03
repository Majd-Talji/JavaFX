package _03_Layout._09_ScrollPane._01_Object_ScrollPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        ScrollPane root = new ScrollPane();

        Button button = new Button("Button");

        button.setPrefSize(300, 200);

        root.setContent(button);

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("JavaFX ScrollPane");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
