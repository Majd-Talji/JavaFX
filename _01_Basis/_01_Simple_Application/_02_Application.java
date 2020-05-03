package _01_Basis._01_Simple_Application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class _02_Application extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Sample Application");
        Text text = new Text("Welcome to Majd Talji");
        text.setFont(new Font(35));

        StackPane layout = new StackPane();
        layout.getChildren().add(text);

        Scene scene = new Scene(layout, 400, 250);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
