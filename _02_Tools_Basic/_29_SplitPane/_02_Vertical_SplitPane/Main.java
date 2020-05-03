package _02_Tools_Basic._29_SplitPane._02_Vertical_SplitPane;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.StackPane;
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
        
        VBox topControl = new VBox(new Label("Top Control"));
        VBox bottomControl = new VBox(new Label("Bottom Control"));
        
        splitPane.getItems().addAll(topControl, bottomControl);
        splitPane.setDividerPosition(0, 0.5);
        splitPane.setOrientation(Orientation.VERTICAL);

        Scene scene = new Scene(splitPane, 400, 200);
        stage.setTitle("JavaFX SplitPane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
