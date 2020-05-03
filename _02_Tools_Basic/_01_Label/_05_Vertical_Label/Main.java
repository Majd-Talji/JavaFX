package _02_Tools_Basic._01_Label._05_Vertical_Label;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Majd Talji");

        label.setTranslateX(240);
        label.setTranslateY(60);

        label.setFont(Font.font("Monospaced"));

        label.setWrapText(true);
        label.setMinWidth(1);
        label.setPrefWidth(1);
        label.setMaxWidth(1);

        label.setScaleX(1.2);
        label.setScaleY(1.2);

        Group root = new Group();

        root.getChildren().add(label);

        Scene scene = new Scene(root, 500, 300);

        stage.setTitle("JavaFX Label");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
