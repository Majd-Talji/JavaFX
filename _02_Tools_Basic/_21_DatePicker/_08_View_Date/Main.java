package _02_Tools_Basic._21_DatePicker._08_View_Date;

import java.time.LocalDate;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        DatePicker datePicker = new DatePicker(LocalDate.now());
        Button button = new Button("Get Selected Date");
        Label label = new Label();

        datePicker.setTranslateX(125);
        datePicker.setTranslateY(50);
        button.setTranslateX(125);
        button.setTranslateY(100);
        label.setTranslateX(125);
        label.setTranslateY(150);

        datePicker.setPrefSize(150, 30);
        button.setPrefSize(150, 30);
        label.setPrefSize(150, 30);

        Group root = new Group();

        root.getChildren().add(datePicker);
        root.getChildren().add(button);
        root.getChildren().add(label);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX DatePicker");

        stage.setScene(scene);

        stage.show();

        button.setOnAction((ActionEvent event) -> {
            LocalDate selectedDate = datePicker.getValue();
            label.setText("Selected Date: " + selectedDate.toString());
        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
