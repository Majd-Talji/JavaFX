package _04_Drawing_Coloring_Animation._02_2D_Shapes._01_Shape._01_Line;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Line line = new Line();

        line.setStartX(50);
        line.setStartY(50);
        
        line.setEndX(350);
        line.setEndY(200);
        
        line.setStroke(Color.RED);

        Group root = new Group();

        root.getChildren().add(line);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX Line");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
