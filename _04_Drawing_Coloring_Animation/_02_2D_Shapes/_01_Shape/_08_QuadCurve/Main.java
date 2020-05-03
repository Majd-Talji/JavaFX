package _04_Drawing_Coloring_Animation._02_2D_Shapes._01_Shape._08_QuadCurve;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.QuadCurve;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        QuadCurve quadCurve = new QuadCurve();

        quadCurve.setStartX(100);
        quadCurve.setStartY(180);

        quadCurve.setEndX(300);
        quadCurve.setEndY(180);

        quadCurve.setControlX(130);
        quadCurve.setControlY(-50);

        quadCurve.setStroke(Color.RED);
        quadCurve.setFill(Color.TRANSPARENT);

        Group root = new Group();

        root.getChildren().add(quadCurve);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX QuadCurve");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
