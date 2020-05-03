package _01_Basis._08_Embedding_Layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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
        window.setTitle("HBox VBox BorderPane");

        HBox topMenu = new HBox();
        Button button1 = new Button("File");
        Button button2 = new Button("Edit");
        Button button3 = new Button("View");
        Button button4 = new Button("Navigate");
        Button button5 = new Button("Refactor");
        topMenu.getChildren().addAll(button1,button2,button3,button4,button5);
        
        VBox leftMenu = new VBox();
        Button button6 = new Button("Projects");
        Button button7 = new Button("Files");
        Button button8 = new Button("Services");
        Button button9 = new Button("start Navigate");
        Button button0 = new Button("Members");
        leftMenu.getChildren().addAll(button6,button7,button8,button9,button0);

        BorderPane layout = new BorderPane();
        layout.setTop(topMenu);
        layout.setLeft(leftMenu);
        Scene scene = new Scene(layout, 300, 200);

        window.setScene(scene);
        window.show();
    }

}
