package _02_Tools_Basic._08_CheckBox._03_Check_Selected;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Select all the languages that you can speak");
        CheckBox cb1 = new CheckBox("Arabic");
        CheckBox cb2 = new CheckBox("Englich");
        CheckBox cb3 = new CheckBox("German");
        Button button = new Button("Get selected language");
        Label resultLabel = new Label("");

        label.setTranslateX(40);
        label.setTranslateY(20);

        cb1.setTranslateX(40);
        cb1.setTranslateY(50);

        cb2.setTranslateX(40);
        cb2.setTranslateY(80);

        cb3.setTranslateX(40);
        cb3.setTranslateY(110);

        button.setTranslateX(40);
        button.setTranslateY(150);

        resultLabel.setTranslateX(40);
        resultLabel.setTranslateY(185);        

        Group root = new Group();

        root.getChildren().add(label);
        root.getChildren().add(cb1);
        root.getChildren().add(cb2);
        root.getChildren().add(cb3);
        root.getChildren().add(button);
        root.getChildren().add(resultLabel);

        Scene scene = new Scene(root, 400, 220);

        stage.setTitle("JavaFX CheckBox");

        stage.setScene(scene);

        stage.show();
        
        button.setOnAction((ActionEvent e) -> {
            
            String s = "";
            
            if (cb1.isSelected()) {
                s += cb1.getText() + " ";
            }
            
            if (cb2.isSelected()) {
                s += cb2.getText() + " ";
            }
            
            if (cb3.isSelected()) {
                s += cb3.getText() + " ";
            }
            
            resultLabel.setText(s);
                        
        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
