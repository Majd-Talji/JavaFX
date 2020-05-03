package _04_Drawing_Coloring_Animation._02_2D_Shapes._01_Shape._05_Arc;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Arc arc = new Arc();

        arc.setCenterX(200);
        arc.setCenterY(125);

        arc.setRadiusY(80);
        arc.setRadiusX(80);
        
        arc.setLength(300);
        
        arc.setStartAngle(30);
        
        arc.setType(ArcType.ROUND);

        arc.setFill(Color.CADETBLUE);
        arc.setStroke(Color.BLUE);

        Group root = new Group();

        root.getChildren().add(arc);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX Arc");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
