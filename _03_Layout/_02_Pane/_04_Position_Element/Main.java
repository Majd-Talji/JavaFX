package _03_Layout._02_Pane._04_Position_Element;

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

        Pane pane = new Pane();

        root.setStyle("-fx-background-color: pink;");

        pane.setStyle("-fx-background-color: cadetblue;");
        pane.setPrefSize(250, 200);
        pane.setTranslateX(50);
        pane.setTranslateY(25);

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        button1.setPrefSize(150, 30);
        button2.setPrefSize(150, 30);
        button3.setPrefSize(150, 30);

        button1.setTranslateX(50);
        button1.setTranslateY(30);
        button2.setTranslateX(50);
        button2.setTranslateY(90);
        button3.setTranslateX(50);
        button3.setTranslateY(150);

        pane.getChildren().add(button1);
        pane.getChildren().add(button2);
        pane.getChildren().add(button3);

        root.getChildren().add(pane);

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("JavaFX Pane");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
