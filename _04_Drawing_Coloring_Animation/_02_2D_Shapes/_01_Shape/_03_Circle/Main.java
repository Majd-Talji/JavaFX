package _04_Drawing_Coloring_Animation._02_2D_Shapes._01_Shape._03_Circle;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Circle circle = new Circle();

        circle.setCenterX(200);
        circle.setCenterY(125);
        
        circle.setRadius(80);
        
        circle.setFill(Color.CADETBLUE);
        circle.setStroke(Color.BLUE);

        Group root = new Group();

        root.getChildren().add(circle);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX Circle");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
