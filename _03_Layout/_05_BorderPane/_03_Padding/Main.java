package _03_Layout._05_BorderPane._03_Padding;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        BorderPane root = new BorderPane();
        
        root.setPadding(new Insets(10));

        Button buttonCenter = new Button("Center");
        Button buttonTop = new Button("Top");
        Button buttonRight = new Button("Right");
        Button buttonBottom = new Button("Bottom");
        Button buttonLeft = new Button("Left");

        root.setCenter(buttonCenter);
        root.setTop(buttonTop);
        root.setRight(buttonRight);
        root.setBottom(buttonBottom);
        root.setLeft(buttonLeft);
        
        buttonCenter.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
        
        buttonTop.setPrefWidth(Double.MAX_VALUE);
        
        buttonRight.setPrefHeight(Double.MAX_VALUE);
        
        buttonBottom.setPrefWidth(Double.MAX_VALUE);
        
        buttonLeft.setPrefHeight(Double.MAX_VALUE);

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("JavaFX BorderPane");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
