package _02_Tools_Basic._19_Separator._03_Style_CSS_Separator;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Separator;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Separator separator1 = new Separator(Orientation.VERTICAL);

        Separator separator2 = new Separator(Orientation.HORIZONTAL);

        separator1.setTranslateX(50);
        separator1.setTranslateY(50);

        separator2.setTranslateX(100);
        separator2.setTranslateY(125);

        separator1.setPrefHeight(150);

        separator2.setPrefWidth(200);

        Group root = new Group();

        root.getChildren().add(separator1);
        root.getChildren().add(separator2);

        Scene scene = new Scene(root, 400, 250);

//        scene.getStylesheets().add("css/my-style.css");
        scene.getStylesheets().add("_02_Tools_Basic/_19_Separator/_03_Style_CSS_Separator/css/my-style.css");

        stage.setTitle("JavaFX Separator");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
