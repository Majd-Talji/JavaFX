package _02_Tools_Basic._18_Hyperlink_Webview._01_Object_Hyperlink;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Hyperlink hyperlink = new Hyperlink("Google.com");

        hyperlink.setTranslateX(100);
        hyperlink.setTranslateY(110);

        hyperlink.setPrefSize(100, 30);

        Group root = new Group();

        root.getChildren().add(hyperlink);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX Hyperlink");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
