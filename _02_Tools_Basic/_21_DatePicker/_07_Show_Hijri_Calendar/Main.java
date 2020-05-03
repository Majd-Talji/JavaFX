package _02_Tools_Basic._21_DatePicker._07_Show_Hijri_Calendar;

import java.time.LocalDate;
import java.time.chrono.HijrahChronology;
import java.util.Locale;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        DatePicker datePicker = new DatePicker(LocalDate.now());
        
        datePicker.setChronology(HijrahChronology.INSTANCE);

        datePicker.setTranslateX(150);
        datePicker.setTranslateY(30);

        datePicker.setPrefSize(100, 30);

        Group root = new Group();

        root.getChildren().add(datePicker);

        Scene scene = new Scene(root, 400, 370);

        stage.setTitle("JavaFX DatePicker");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        Locale.setDefault(new Locale("ar"));
        launch(args);
    }

}
