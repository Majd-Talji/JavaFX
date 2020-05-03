package _03_Layout._11_TitledPane_Accordion._01_Object_TitledPane_In_FlowPane;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        FlowPane root = new FlowPane();
        
        root.setAlignment(Pos.TOP_CENTER);

        Button button = new Button("Button");
        
        TitledPane titledPane = new TitledPane("Titled Pane", button);
        
        titledPane.setPrefWidth(200);

        root.getChildren().add(titledPane);

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("JavaFX TitledPane & Accordion");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
