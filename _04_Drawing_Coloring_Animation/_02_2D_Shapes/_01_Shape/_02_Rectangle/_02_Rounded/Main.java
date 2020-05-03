package _04_Drawing_Coloring_Animation._02_2D_Shapes._01_Shape._02_Rectangle._02_Rounded;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
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

        Rectangle rectangle = new Rectangle();

        rectangle.setX(70);
        rectangle.setY(50);

        rectangle.setWidth(260);
        rectangle.setHeight(150);
        
        rectangle.setArcWidth(30);
        rectangle.setArcHeight(20);

        rectangle.setFill(Color.CADETBLUE);
        rectangle.setStroke(Color.BLACK);

        Group root = new Group();

        root.getChildren().add(rectangle);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX Rounded Rectangle");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
