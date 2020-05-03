package _02_Tools_Basic._21_DatePicker._04_Format_Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;
import javafx.util.StringConverter;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    final String pattern = "d-M-Y";

    public StringConverter dateFormatter() {
        StringConverter converter = new StringConverter<LocalDate>() {

            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(pattern);

            @Override
            public String toString(LocalDate date) {
                if (date != null) {
                    return dateFormatter.format(date);
                }
                return "";
            }

            @Override
            public LocalDate fromString(String string) {
                if (string != null && string.isEmpty()) {
                    return LocalDate.parse(string, dateFormatter);
                }
                return null;
            }

        };
        return converter;
    }

    @Override
    public void start(Stage stage) {

        DatePicker datePicker = new DatePicker(LocalDate.of(2020, 04, 21));

        datePicker.setConverter(dateFormatter());

        datePicker.setPromptText(pattern.toLowerCase());

        datePicker.setTranslateX(140);
        datePicker.setTranslateY(30);

        datePicker.setPrefSize(120, 30);

        Group root = new Group();

        root.getChildren().add(datePicker);

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("JavaFX DatePicker");

        stage.setScene(scene);

        stage.show();

        root.requestFocus();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
