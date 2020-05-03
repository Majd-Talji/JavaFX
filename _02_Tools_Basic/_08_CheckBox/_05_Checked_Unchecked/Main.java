package _02_Tools_Basic._08_CheckBox._05_Checked_Unchecked;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
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

        CheckBox checkBox = new CheckBox("Check Box");
        Label label = new Label();

        checkBox.setTranslateX(40);
        checkBox.setTranslateY(40);

        label.setTranslateX(40);
        label.setTranslateY(90);

        Font newFont = new Font("Arial", 18);

        checkBox.setFont(newFont);
        label.setFont(newFont);

        checkBox.setTextFill(Color.RED);
        label.setTextFill(Color.BLUE);

        label.setText("Check Box is not checked");

        Group root = new Group();

        root.getChildren().add(checkBox);
        root.getChildren().add(label);

        Scene scene = new Scene(root, 300, 250);

        stage.setTitle("JavaFX CheckBox");

        stage.setScene(scene);

        stage.show();

        checkBox.setOnAction((ActionEvent e) -> {

            if (checkBox.isSelected()) {
                label.setText("Check Box is checked");
            } else {
                label.setText("Check Box is not checked");
            }

        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
