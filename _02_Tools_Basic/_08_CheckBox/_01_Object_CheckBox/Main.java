package _02_Tools_Basic._08_CheckBox._01_Object_CheckBox;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        CheckBox checkBox = new CheckBox("CheckBox");

        checkBox.setTranslateX(160);
        checkBox.setTranslateY(110);

        Group root = new Group();

        root.getChildren().add(checkBox);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX CheckBox");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
