package _02_Tools_Basic._21_DatePicker._05_Date_can_user_Choose;

import java.time.LocalDate;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;
import javafx.util.Callback;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        DatePicker datePicker = new DatePicker(LocalDate.now());
        
        final Callback<DatePicker, DateCell> dayCellFactory = (DatePicker) -> new DateCell() {
            @Override
            public void updateItem(LocalDate item, boolean empty) {
                super.updateItem(item, empty);
                if (item.isBefore(LocalDate.now())) {
                    setDisable(true);
                    setStyle("-fx-background-color: #ffc0cb");
                }
            }
        };
        
        datePicker.setDayCellFactory(dayCellFactory);

        datePicker.setTranslateX(140);
        datePicker.setTranslateY(30);

        datePicker.setPrefSize(120, 30);

        Group root = new Group();

        root.getChildren().add(datePicker);

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("JavaFX DatePicker");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
