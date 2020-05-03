package _02_Tools_Basic._07_RadioButton._04_Event_GetUserData;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Select your language");
        RadioButton radioButton1 = new RadioButton("Arabic");
        RadioButton radioButton2 = new RadioButton("Englich");
        RadioButton radioButton3 = new RadioButton("German");
        Button button = new Button("Get selected language");
        Label resultLabel = new Label("");

        label.setTranslateX(40);
        label.setTranslateY(20);

        radioButton1.setTranslateX(40);
        radioButton1.setTranslateY(50);

        radioButton2.setTranslateX(40);
        radioButton2.setTranslateY(80);

        radioButton3.setTranslateX(40);
        radioButton3.setTranslateY(110);

        button.setTranslateX(40);
        button.setTranslateY(150);

        resultLabel.setTranslateX(40);
        resultLabel.setTranslateY(185);

        ToggleGroup group = new ToggleGroup();
        radioButton1.setToggleGroup(group);
        radioButton2.setToggleGroup(group);
        radioButton3.setToggleGroup(group);

        radioButton1.setUserData("Arabic");
        radioButton2.setUserData("Englich");
        radioButton3.setUserData("German");

        Group root = new Group();

        root.getChildren().add(label);
        root.getChildren().add(radioButton1);
        root.getChildren().add(radioButton2);
        root.getChildren().add(radioButton3);
        root.getChildren().add(button);
        root.getChildren().add(resultLabel);

        Scene scene = new Scene(root, 400, 220);

        stage.setTitle("JavaFX RadioButton");

        stage.setScene(scene);

        stage.show();
        
        button.setOnAction((ActionEvent e) -> {
            
            resultLabel.setText(group.getSelectedToggle().getUserData().toString());
            
        });
        
        radioButton1.setSelected(true);

    }

    public static void main(String[] args) {
        launch(args);
    }

}
