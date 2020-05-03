package _04_Drawing_Coloring_Animation._03_3D_Shapes._01_Bouns_3D_Subscene;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Box;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage s) throws Exception {
        BorderPane p = new BorderPane();
        Box box = new Box(100, 100, 100);
        box.setManaged(false);

        Pane pane = new Pane(box);
        pane.setStyle("-fx-background-color: black;");
        SubScene sub = new SubScene(pane, 600, 600);
        p.setCenter(sub);

        p.setRight(new Button("Hey!!"));

        Slider s1 = new Slider();
        s1.setMax(1000);
        s1.valueProperty().bindBidirectional(box.translateXProperty());
        p.setBottom(s1);

        s.setScene(new Scene(p));
        s.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
