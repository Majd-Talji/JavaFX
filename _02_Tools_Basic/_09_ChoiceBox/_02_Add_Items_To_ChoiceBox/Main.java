package _02_Tools_Basic._09_ChoiceBox._02_Add_Items_To_ChoiceBox;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        ChoiceBox choiceBox = new ChoiceBox();

        choiceBox.getItems().addAll("Option 1", "Option 2", "Option 3", "Option 4");

        choiceBox.setTranslateX(150);
        choiceBox.setTranslateY(110);

        choiceBox.setPrefSize(100, 30);

        Group root = new Group();

        root.getChildren().add(choiceBox);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX ChoiceBox");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
