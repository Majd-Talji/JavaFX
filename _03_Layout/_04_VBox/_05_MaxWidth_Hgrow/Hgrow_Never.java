package _03_Layout._04_VBox._05_MaxWidth_Hgrow;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Hgrow_Never extends Application {

    @Override
    public void start(Stage stage) {

        VBox root = new VBox();

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");

        button1.setMaxHeight(Double.MAX_VALUE);
        button2.setMaxHeight(Double.MAX_VALUE);

        button1.setMaxWidth(Double.MAX_VALUE);
        button2.setMaxWidth(Double.MAX_VALUE);

        VBox.setVgrow(button1, Priority.NEVER);
        VBox.setVgrow(button2, Priority.ALWAYS);
        
        VBox.setMargin(button1, new Insets(10, 10, 5, 10));
        VBox.setMargin(button2, new Insets(5, 10, 10, 10));

        root.getChildren().add(button1);
        root.getChildren().add(button2);

        Scene scene = new Scene(root, 300, 150);

        stage.setTitle("JavaFX VBox");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
