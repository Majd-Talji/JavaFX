package _02_Tools_Basic._10_ComboBox._04_Get_Item_From_ComboBox;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main2 extends Application {

    @Override
    public void start(Stage stage) {

        ComboBox comboBox = new ComboBox();
        Button button = new Button("View Selected Item");
        Label label = new Label();

        comboBox.getItems().addAll("Java", "PHP", "C", "C++", "HTML");

        comboBox.setPrefSize(100, 30);
        button.setPrefSize(150, 30);
        label.setPrefSize(200, 30);

        comboBox.setTranslateX(40);
        comboBox.setTranslateY(40);
        button.setTranslateX(160);
        button.setTranslateY(40);
        label.setTranslateX(40);
        label.setTranslateY(80);

        Group root = new Group();

        root.getChildren().add(comboBox);
        root.getChildren().add(button);
        root.getChildren().add(label);

        Scene scene = new Scene(root, 360, 250);

        stage.setTitle("JavaFX ComboBox");

        stage.setScene(scene);

        stage.show();

        button.setOnAction((ActionEvent e) -> {

            if (comboBox.getSelectionModel().isEmpty()) {
                label.setText("You select: ");
            } else {
                label.setText("You select: "+ comboBox.getSelectionModel().getSelectedItem().toString());
            }

        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
