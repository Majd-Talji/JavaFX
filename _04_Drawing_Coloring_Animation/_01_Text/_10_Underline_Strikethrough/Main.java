package _04_Drawing_Coloring_Animation._01_Text._10_Underline_Strikethrough;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
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

        Text text1 = new Text("Plan A");
        Text text2 = new Text("Plan B");

        text1.setX(90);
        text1.setY(90);
        text2.setX(150);
        text2.setY(140);

        text1.setFont(Font.font("Tahoma", FontWeight.BOLD, 28));
        text2.setFont(Font.font("Tahoma", FontWeight.BOLD, 28));

        text1.setFill(Color.YELLOW);
        text2.setFill(Color.RED);

        text1.setStrikethrough(true);

        text2.setUnderline(true);

        Group root = new Group();

        root.getChildren().add(text1);
        root.getChildren().add(text2);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX Text");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
