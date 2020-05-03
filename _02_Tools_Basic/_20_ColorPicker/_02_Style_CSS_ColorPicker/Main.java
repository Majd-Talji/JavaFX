package _02_Tools_Basic._20_ColorPicker._02_Style_CSS_ColorPicker;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        ColorPicker colorPicker = new ColorPicker();

        colorPicker.setTranslateX(150);
        colorPicker.setTranslateY(110);

        colorPicker.setPrefSize(100, 30);

        Group root = new Group();

        root.getChildren().add(colorPicker);

        Scene scene = new Scene(root, 400, 250);

        scene.getStylesheets().add("_02_Tools_Basic/_20_ColorPicker/_02_Style_CSS_ColorPicker/css/my-style.css");

        stage.setTitle("JavaFX ColorPicker");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
