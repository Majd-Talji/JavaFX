package _03_Layout._12_AnchorPane._04_Resize;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        AnchorPane root = new AnchorPane();

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        AnchorPane.setTopAnchor(button1, 30.0);
        AnchorPane.setRightAnchor(button1, 30.0);
        AnchorPane.setLeftAnchor(button1, 30.0);

        button1.setPrefHeight(30);

        AnchorPane.setTopAnchor(button2, 70.0);
        AnchorPane.setRightAnchor(button2, 130.0);
        AnchorPane.setLeftAnchor(button2, 30.0);
        AnchorPane.setBottomAnchor(button2, 30.0);

        AnchorPane.setTopAnchor(button3, 70.0);
        AnchorPane.setRightAnchor(button3, 30.0);
        AnchorPane.setBottomAnchor(button3, 30.0);

        button3.setPrefWidth(80);

        root.getChildren().add(button1);
        root.getChildren().add(button2);
        root.getChildren().add(button3);

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("JavaFX AnchorPane");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
