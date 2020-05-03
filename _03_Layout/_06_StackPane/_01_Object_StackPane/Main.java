package _03_Layout._06_StackPane._01_Object_StackPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        StackPane root = new StackPane();

        Button button = new Button("Button");
        
        root.getChildren().add(button);

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("JavaFX StackPane");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
