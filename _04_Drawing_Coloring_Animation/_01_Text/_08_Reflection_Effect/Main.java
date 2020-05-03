package _04_Drawing_Coloring_Animation._01_Text._08_Reflection_Effect;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.Reflection;
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

        Text text = new Text("Majd Talji");

        text.setX(45);
        text.setY(120);
        
        text.setFont(Font.font("Tahoma", FontWeight.BOLD, 40));
        
        text.setFill(Color.CADETBLUE);
        
        Reflection reflection = new Reflection();
        reflection.setFraction(0.7f);
        
        text.setCache(true);
        text.setEffect(reflection);

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
