package _04_Drawing_Coloring_Animation._01_Text._06_Drop_Shadow_Effect;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
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
        text.setY(130);
        
        text.setFont(Font.font("Tahoma", FontWeight.BOLD, 40));
        
        text.setFill(Color.RED);
        
        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetX(2.0f);
        dropShadow.setOffsetY(4.0f);
        
        text.setEffect(dropShadow);

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
