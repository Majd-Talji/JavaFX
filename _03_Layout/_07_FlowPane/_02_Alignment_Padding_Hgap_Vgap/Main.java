package _03_Layout._07_FlowPane._02_Alignment_Padding_Hgap_Vgap;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

        root.setAlignment(Pos.CENTER);

        root.setPadding(new Insets(5));

        root.setHgap(10);

        root.setVgap(10);

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");
        Button button6 = new Button("Button 6");

        root.getChildren().addAll(button1, button2, button3, button4, button5, button6);

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("JavaFX FlowPane");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
