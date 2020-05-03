package _04_Drawing_Coloring_Animation._02_2D_Shapes._01_Shape._11_Path_PathElement;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.QuadCurveTo;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Path path1 = new Path();
        MoveTo move1 = new MoveTo(150, 100);
        QuadCurveTo quadCurve = new QuadCurveTo();
        quadCurve.setX(250);
        quadCurve.setY(100);
        quadCurve.setControlX(200);
        quadCurve.setControlY(0);

        path1.setFill(Color.WHITE);
        path1.setStrokeWidth(3);

        path1.getElements().addAll(move1, quadCurve);

        Path path2 = new Path();
        MoveTo move2 = new MoveTo(150, 100);
        LineTo line1 = new LineTo(250, 100);
        LineTo line2 = new LineTo(200, 220);
        LineTo line3 = new LineTo(150, 100);

        path2.getElements().addAll(move2, line1, line2, line3);

        path2.setFill(Color.GOLDENROD);
        path2.setStrokeWidth(3);

        Group root = new Group();

        root.getChildren().addAll(path1, path2);

        Scene scene = new Scene(root, 400, 270);

        scene.setFill(Color.PALEGREEN);

        stage.setTitle("JavaFX Path & PathElement");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
