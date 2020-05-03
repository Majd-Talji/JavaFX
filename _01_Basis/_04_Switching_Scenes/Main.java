package _01_Basis._04_Switching_Scenes;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        
        Label label1 = new Label("Welcome to the first Scene!");
        Button button1 = new Button("second Scene");
        button1.setOnAction((ActionEvent event) -> {
            window.setScene(scene2);
        });
        
        VBox layout1 = new VBox(30);
        layout1.setAlignment(Pos.CENTER);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 300, 200);
        
        Label label2 = new Label("Welcome to the second Scene!");
        Button button2 = new Button("first Scene");
        button2.setOnAction((ActionEvent event) -> {
            window.setScene(scene1);
        });
        
        VBox layout2 = new VBox(30);
        layout2.setAlignment(Pos.CENTER);
        layout2.getChildren().addAll(label2, button2);
        scene2 = new Scene(layout2, 300, 200);

        window.setScene(scene1);
        window.setTitle("Switching Scenes");
        window.show();
    }

}
