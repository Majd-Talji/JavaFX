package _02_Tools_Basic._01_Label._06_Rotate;

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

        Label label_1 = new Label("Majd Talji");
        Label label_2 = new Label("Majd Talji");
        Label label_3 = new Label("Majd Talji");

        label_1.setTranslateX(60);
        label_1.setTranslateY(90);
        label_2.setTranslateX(210);
        label_2.setTranslateY(90);
        label_3.setTranslateX(350);
        label_3.setTranslateY(90);

        label_1.setFont(new Font("Arial", 24));
        label_2.setFont(new Font("Arial", 24));
        label_3.setFont(new Font("Arial", 24));

        label_1.setRotate(45);
        label_2.setRotate(90);
        label_3.setRotate(-45);

        Group root = new Group();

        root.getChildren().add(label_1);
        root.getChildren().add(label_2);
        root.getChildren().add(label_3);

        Scene scene = new Scene(root, 500, 200);

        stage.setTitle("JavaFX Label");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
