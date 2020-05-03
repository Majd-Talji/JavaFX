package _03_Layout._10_GridPane._04_RowSpan_ColumnSpan;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        GridPane root = new GridPane();

        root.setAlignment(Pos.CENTER);

        root.setPadding(new Insets(5));

        root.setHgap(10);

        root.setVgap(10);

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");

        button1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        button2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        button3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        button4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        GridPane.setVgrow(button1, Priority.ALWAYS);
        GridPane.setVgrow(button2, Priority.ALWAYS);
        GridPane.setVgrow(button3, Priority.ALWAYS);
        GridPane.setVgrow(button4, Priority.ALWAYS);

        GridPane.setHgrow(button1, Priority.ALWAYS);
        GridPane.setHgrow(button2, Priority.ALWAYS);
        GridPane.setHgrow(button3, Priority.ALWAYS);
        GridPane.setHgrow(button4, Priority.ALWAYS);

        root.add(button1, 0, 0);
        
        GridPane.setRowSpan(button1, 2);

        root.add(button2, 1, 0);
        
        GridPane.setColumnSpan(button2, 2);

        root.add(button3, 1, 1);

        root.add(button4, 2, 1);

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("JavaFX GridPane");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
