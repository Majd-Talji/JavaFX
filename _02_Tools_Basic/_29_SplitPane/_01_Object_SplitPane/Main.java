package _02_Tools_Basic._29_SplitPane._01_Object_SplitPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {
        SplitPane splitPane = new SplitPane();
        
        VBox leftControl = new VBox(new Label("Left Control"));
        VBox rightControl = new VBox(new Label("Right Control"));
        
        splitPane.getItems().addAll(leftControl, rightControl);
        splitPane.setDividerPosition(0, 0.5);

        Scene scene = new Scene(splitPane, 400, 200);
        stage.setTitle("JavaFX SplitPane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
