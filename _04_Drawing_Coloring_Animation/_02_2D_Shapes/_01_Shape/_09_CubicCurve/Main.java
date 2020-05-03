package _04_Drawing_Coloring_Animation._02_2D_Shapes._01_Shape._09_CubicCurve;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        CubicCurve quadCurve = new CubicCurve();

        quadCurve.setStartX(50);
        quadCurve.setStartY(125);

        quadCurve.setEndX(350);
        quadCurve.setEndY(125);

        quadCurve.setControlX1(150);
        quadCurve.setControlY1(20);

        quadCurve.setControlX2(250);
        quadCurve.setControlY2(230);

        quadCurve.setStroke(Color.RED);
        quadCurve.setFill(Color.TRANSPARENT);

        Group root = new Group();

        root.getChildren().add(quadCurve);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX CubicCurve");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
