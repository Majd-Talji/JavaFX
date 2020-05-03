package _04_Drawing_Coloring_Animation._01_Text._09_Perspective_Effect;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.PerspectiveTransform;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Text text = new Text("Majd Talji");
        Rectangle rectangle = new Rectangle();

        rectangle.setWidth(280);
        rectangle.setHeight(80);
        
        text.setFont(Font.font("Tahoma", FontWeight.BOLD, 40));

        text.setFill(Color.YELLOW);
        rectangle.setFill(Color.BLUE);

        PerspectiveTransform pf = new PerspectiveTransform();

        pf.setUlx(40);
        pf.setUly(80);
        pf.setUrx(350);
        pf.setUry(110);
        pf.setLrx(350);
        pf.setLry(130);
        pf.setLlx(40);
        pf.setLly(160);

        text.setCache(true);
        rectangle.setCache(true);

        text.setEffect(pf);
        rectangle.setEffect(pf);

        Group root = new Group();

        root.getChildren().add(rectangle);        
        root.getChildren().add(text);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX Text");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
