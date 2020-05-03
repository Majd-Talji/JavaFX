package _03_Layout._06_StackPane._04_Padding;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        StackPane root = new StackPane();
        
        root.setPadding(new Insets(10));

        Rectangle rectangle1 = new Rectangle(200, 150, Color.RED);
        Rectangle rectangle2 = new Rectangle(200, 150, Color.YELLOW);
        Rectangle rectangle3 = new Rectangle(200, 150, Color.BLUE);

        StackPane.setAlignment(rectangle1, Pos.TOP_RIGHT);
        StackPane.setAlignment(rectangle2, Pos.CENTER);
        StackPane.setAlignment(rectangle3, Pos.BOTTOM_LEFT);

        root.getChildren().add(rectangle1);
        root.getChildren().add(rectangle2);
        root.getChildren().add(rectangle3);

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("JavaFX StackPane");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
