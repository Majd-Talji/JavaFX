package _02_Tools_Basic._10_ComboBox._02_Add_Items_To_ComboBox;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        ComboBox comboBox = new ComboBox();

        comboBox.getItems().addAll("Java", "PHP", "C", "C++", "HTML");

        comboBox.setTranslateX(150);
        comboBox.setTranslateY(110);

        comboBox.setPrefSize(100, 30);

        Group root = new Group();

        root.getChildren().add(comboBox);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX ComboBox");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
