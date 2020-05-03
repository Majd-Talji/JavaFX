package _04_Drawing_Coloring_Animation._01_Text._03_Stroke_Color;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
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

        Font newFont = new Font("Cambria", 46);
        text.setFont(newFont);

        text.setFill(Color.BROWN);

        text.setStrokeWidth(1);

        text.setStroke(Color.BLUE);

        text.setX(45);
        text.setY(130);

        Group root = new Group();

        root.getChildren().add(text);

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("JavaFX Text");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
