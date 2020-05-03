package _02_Tools_Basic._28_Spinner._06_Language_Select;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Language arabic = new Language("ar", "عربي", "اهلا وسهلا");
        Language english = new Language("en", "English", "Welcome");
        Language deutsch = new Language("de", "Deutsch", "Willkommen");

        List<Language> languages = new ArrayList<Language>();
        languages.add(arabic);
        languages.add(english);
        languages.add(deutsch);

        Label label = new Label("Select Language: ");
        Spinner<Language> spinner = new Spinner<Language>();

        Label labelMessage = new Label("?");

        SpinnerValueFactory<Language> valueFactory
                = new SpinnerValueFactory<Language>() {
            @Override
            public void decrement(int steps) {
                Language current = this.getValue();
                int idx = languages.indexOf(current);
                int newIdx = (languages.size() + idx - steps) % languages.size();
                Language newLang = languages.get(newIdx);
                this.setValue(newLang);
            }

            @Override
            public void increment(int steps) {
                Language current = this.getValue();
                int idx = languages.indexOf(current);
                int newIdx = (idx + steps) % languages.size();
                Language newLang = languages.get(newIdx);
                this.setValue(newLang);
            }
        };

        valueFactory.setValue(deutsch);

        spinner.setValueFactory(valueFactory);

        spinner.valueProperty().addListener(new ChangeListener<Language>() {
            @Override
            public void changed(ObservableValue<? extends Language> observable, Language oldValue, Language newValue) {
                labelMessage.setText("Greeting: " + newValue.getGreeting());
            }
        });

        FlowPane root = new FlowPane();
        root.setHgap(15);
        root.setVgap(15);
        root.setPadding(new Insets(10));

        root.getChildren().add(label);
        root.getChildren().add(spinner);
        root.getChildren().add(labelMessage);

        Scene scene = new Scene(root, 420, 200);

        stage.setTitle("JavaFX Spinner");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
