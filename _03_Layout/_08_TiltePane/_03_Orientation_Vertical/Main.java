package _03_Layout._08_TiltePane._03_Orientation_Vertical;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        TilePane root = new TilePane();

        root.setOrientation(Orientation.VERTICAL);

        root.setAlignment(Pos.CENTER);

        root.setPadding(new Insets(5));

        root.setHgap(10);

        root.setVgap(10);

        Button button1 = new Button("Monday");
        Button button2 = new Button("Tuesday");
        Button button3 = new Button("Wednesday");
        Button button4 = new Button("Tursday");
        Button button5 = new Button("Friday");
        Button button6 = new Button("Saturday");
        Button button7 = new Button("Sunday");

        root.getChildren().addAll(button1, button2, button3, button4, button5, button6, button7);

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("JavaFX TilePane");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
