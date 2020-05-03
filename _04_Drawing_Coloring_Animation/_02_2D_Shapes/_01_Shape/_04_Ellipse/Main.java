package _04_Drawing_Coloring_Animation._02_2D_Shapes._01_Shape._04_Ellipse;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Ellipse ellipse = new Ellipse();

        ellipse.setCenterX(200);
        ellipse.setCenterY(125);

        ellipse.setRadiusY(60);

        ellipse.setRadiusX(110);

        ellipse.setFill(Color.CADETBLUE);
        ellipse.setStroke(Color.BLUE);

        Group root = new Group();

        root.getChildren().add(ellipse);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX Ellipse");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
