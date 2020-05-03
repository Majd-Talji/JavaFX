package _03_Layout._03_HBox._05_MaxWidth_Hgrow;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Hgrow_Always extends Application {

    @Override
    public void start(Stage stage) {

        HBox root = new HBox();
        
        root.setSpacing(10);
        
        root.setAlignment(Pos.CENTER);

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        
        button1.setMaxWidth(Double.MAX_VALUE);
        button2.setMaxWidth(Double.MAX_VALUE);
        
        HBox.setHgrow(button1, Priority.ALWAYS);
        HBox.setHgrow(button2, Priority.ALWAYS);

        root.getChildren().add(button1);
        root.getChildren().add(button2);

        Scene scene = new Scene(root, 300, 150);

        stage.setTitle("JavaFX HBox");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
