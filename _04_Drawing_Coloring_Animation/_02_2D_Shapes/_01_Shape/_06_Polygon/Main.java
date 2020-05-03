package _04_Drawing_Coloring_Animation._02_2D_Shapes._01_Shape._06_Polygon;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Polygon polygon = new Polygon();

        polygon.getPoints().addAll(
                100.0, 200.0,
                200.0, 50.0,
                300.0, 200.0
        );

        polygon.setFill(Color.CADETBLUE);
        polygon.setStroke(Color.BLACK);

        Group root = new Group();

        root.getChildren().add(polygon);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX Polygon");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
