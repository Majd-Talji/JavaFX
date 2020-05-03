package _01_Basis._06_Communicating_Between_Windows;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
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
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Confirm Box");

        Button button = new Button("Show Alert");
        button.setOnAction((ActionEvent event) -> {
            boolean result = ConfirmBox.display("Title", "Are you sure want to need naked pice?");
            System.out.println(result);
        });

        StackPane layout = new StackPane();
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(button);
        Scene scene = new Scene(layout, 300, 200);

        window.setScene(scene);
        window.show();
    }

}
