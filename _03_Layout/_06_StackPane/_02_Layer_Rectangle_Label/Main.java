package _03_Layout._06_StackPane._02_Layer_Rectangle_Label;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        StackPane root = new StackPane();

        Rectangle rectangle = new Rectangle(160, 100, Color.CADETBLUE);
        Label label = new Label("Rectangle");

        label.setTextFill(Color.WHITE);
        label.setFont(new Font(20));

        root.getChildren().add(rectangle);
        root.getChildren().add(label);

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("JavaFX StackPane");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
