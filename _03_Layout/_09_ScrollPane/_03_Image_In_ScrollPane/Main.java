package _03_Layout._09_ScrollPane._03_Image_In_ScrollPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        ScrollPane root = new ScrollPane();

        ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("space")));

        root.setContent(imageView);

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("JavaFX ScrollPane");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
