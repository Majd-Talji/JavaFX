package _04_Drawing_Coloring_Animation._01_Text._01_Object_Text;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Pagination;
import javafx.scene.layout.AnchorPane;
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
        
        text.setX(150);
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
