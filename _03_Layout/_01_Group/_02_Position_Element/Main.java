package _03_Layout._01_Group._02_Position_Element;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Group root = new Group();

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        
        button1.setPrefSize(150, 30);
        button2.setPrefSize(150, 30);
        button3.setPrefSize(150, 30);

        button1.setTranslateX(50);
        button1.setTranslateY(60);
        button2.setTranslateX(100);
        button2.setTranslateY(110);
        button3.setTranslateX(150);
        button3.setTranslateY(160);
        
        root.getChildren().add(button1);
        root.getChildren().add(button2);
        root.getChildren().add(button3);

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("JavaFX Group");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
