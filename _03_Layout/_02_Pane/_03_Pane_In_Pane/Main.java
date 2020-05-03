package _03_Layout._02_Pane._03_Pane_In_Pane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Pane root = new Pane();

        Pane pane = new Pane();
        
        root.setStyle("-fx-background-color: pink;");

        pane.setStyle("-fx-background-color: cadetblue;");
        pane.setPrefSize(250, 200);
        pane.setTranslateX(50);
        pane.setTranslateY(25);

        root.getChildren().add(pane);

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("JavaFX Pane");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
