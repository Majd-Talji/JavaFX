package _03_Layout._10_GridPane._01_Object_GridPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        GridPane root = new GridPane();

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");
        Button button6 = new Button("Button 6");

        root.add(button1, 0, 0);
        root.add(button2, 1, 0);
        root.add(button3, 2, 0);
        root.add(button4, 0, 1);
        root.add(button5, 1, 1);
        root.add(button6, 2, 1);

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("JavaFX GridPane");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
