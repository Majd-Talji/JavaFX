package _02_Tools_Basic._19_Separator._01_Object_Separator;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Separator;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Separator separator = new Separator();

        separator.setTranslateX(100);
        separator.setTranslateY(124);

        separator.setPrefWidth(200);

        Group root = new Group();

        root.getChildren().add(separator);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX Separator");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
