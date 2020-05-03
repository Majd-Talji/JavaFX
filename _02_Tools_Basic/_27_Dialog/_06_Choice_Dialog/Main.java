package _02_Tools_Basic._27_Dialog._06_Choice_Dialog;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Dialog Demo");

        Button button = new Button("Open Exception Dialog");
        
        button.setOnAction(e -> {
                new ChoicesDialog();
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 400, 200);
        window.setScene(scene);
        window.show();
    }

}
