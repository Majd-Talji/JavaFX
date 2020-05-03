package _03_Layout._12_AnchorPane._02_Object_AnchorPane_RightAnchor_LeftAnchor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        AnchorPane root = new AnchorPane();

        Button button = new Button("Button");

        AnchorPane.setRightAnchor(button, 30.0);

        AnchorPane.setLeftAnchor(button, 30.0);

        root.getChildren().add(button);

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("JavaFX AnchorPane");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
