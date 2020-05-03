package _02_Tools_Basic._28_Spinner._03_Spinner_Value_String;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Spinner spinner = new Spinner();
        spinner.setTranslateX(100);
        spinner.setTranslateY(40);
        spinner.setPrefSize(100, 30);

        ObservableList<String> levels = FXCollections.observableArrayList();
        levels.add("Easy");
        levels.add("Meduim");
        levels.add("Hard");

        SpinnerValueFactory<String> valueFactory = new SpinnerValueFactory.ListSpinnerValueFactory((ObservableList) levels);
        spinner.setValueFactory(valueFactory);

        Label label = new Label("Value: Meduim");

        label.setTranslateX(100);
        label.setTranslateY(80);
        label.setPrefSize(100, 30);

        spinner.valueProperty().addListener((observable, oldValue, newValue) -> {
            label.setText("Value: " + spinner.getValue());
        });

        valueFactory.setValue(levels.get(1));

        Group layout = new Group();
        layout.getChildren().addAll(spinner, label);

        Scene scene = new Scene(layout, 300, 250);
        stage.setTitle("Spinner Demo");
        stage.setScene(scene);
        stage.show();
    }

}
