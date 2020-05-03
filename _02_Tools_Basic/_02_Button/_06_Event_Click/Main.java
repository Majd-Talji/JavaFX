package _02_Tools_Basic._02_Button._06_Event_Click;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Button button = new Button("Open Window");

        button.setTranslateX(150);
        button.setTranslateY(110);
        
        Stage stage2 = new Stage();
        
        stage2.setTitle("Second Window");
        stage2.setMaxWidth(400);
        stage2.setMaxHeight(250);

        button.setFont(new Font("Arial", 18));

        Group root = new Group();

        root.getChildren().add(button);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("First Window");

        stage.setScene(scene);

        stage.show();

        DropShadow shadow = new DropShadow(10, Color.RED);
        button.setEffect(shadow);

        button.setOnAction((ActionEvent e) -> {
            stage2.show();
        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
