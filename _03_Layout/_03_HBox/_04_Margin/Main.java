package _03_Layout._03_HBox._04_Margin;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        HBox root = new HBox();        

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        button1.setPrefSize(150, 30);
        button2.setPrefSize(150, 30);
        button3.setPrefSize(150, 30);
        
        HBox.setMargin(button1, new Insets(10, 10, 10, 10));
        HBox.setMargin(button2, new Insets(10, 0, 10, 0));
        HBox.setMargin(button3, new Insets(10, 10, 10, 10));

        root.getChildren().add(button1);
        root.getChildren().add(button2);
        root.getChildren().add(button3);

        Scene scene = new Scene(root, 300, 150);

        stage.setTitle("JavaFX HBox");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
