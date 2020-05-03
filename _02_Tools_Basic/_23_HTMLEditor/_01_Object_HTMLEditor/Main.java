package _02_Tools_Basic._23_HTMLEditor._01_Object_HTMLEditor;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        HTMLEditor htmlEditor = new HTMLEditor();

        htmlEditor.setTranslateX(20);
        htmlEditor.setTranslateY(20);

        htmlEditor.setPrefSize(600, 300);

        Group root = new Group();

        root.getChildren().add(htmlEditor);

        Scene scene = new Scene(root, 640, 340);

        stage.setTitle("JavaFX  HTML Editor");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
