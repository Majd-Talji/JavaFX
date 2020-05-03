package _03_Layout._04_VBox._04_Margin;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        VBox root = new VBox();
        
        root.setSpacing(10);
        
        root.setAlignment(Pos.CENTER);

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        button1.setPrefSize(150, 30);
        button2.setPrefSize(150, 30);
        button3.setPrefSize(150, 30);

        VBox.setMargin(button1, new Insets(10, 10, 10, 10));
        VBox.setMargin(button2, new Insets(0, 10, 0, 10));
        VBox.setMargin(button3, new Insets(10, 10, 10, 10));

        root.getChildren().add(button1);
        root.getChildren().add(button2);
        root.getChildren().add(button3);

        Scene scene = new Scene(root, 300, 150);

        stage.setTitle("JavaFX VBox");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}