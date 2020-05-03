package _04_Drawing_Coloring_Animation._02_2D_Shapes._02_Operation._03_Subtraction_Operation;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {
        
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        
        rectangle1.setX(80);
        rectangle1.setY(60);
        rectangle2.setX(170);
        rectangle2.setY(110);
        
        rectangle1.setWidth(150);
        rectangle1.setHeight(80);
        rectangle2.setWidth(150);
        rectangle2.setHeight(80);
        
        Shape shape = Shape.subtract(rectangle1, rectangle2);
        
        shape.setStroke(Color.BLACK);
        shape.setFill(Color.CADETBLUE);
        shape.setStrokeWidth(3);

        Group root = new Group();

        root.getChildren().addAll(shape);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX Subtraction Operation");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
