package _02_Tools_Basic._28_Spinner._02_Event_Change_Value;

import javafx.application.Application;
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

    @Override
    public void start(Stage stage) {

        stage.setTitle("Spinner Demo");

        Spinner spinner = new Spinner();
        spinner.setTranslateX(100);
        spinner.setTranslateY(40);
        spinner.setPrefSize(100, 30);

        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 1);
        spinner.setValueFactory(valueFactory);

        Label label = new Label("Value: 0");

        label.setTranslateX(100);
        label.setTranslateY(80);
        label.setPrefSize(100, 30);
        
        spinner.valueProperty().addListener((observable, oldValue, newValue) -> {
                label.setText("Value: " + spinner.getValue());
        });

        valueFactory.setValue(Integer.MIN_VALUE);

        Group layout = new Group();
        layout.getChildren().addAll(spinner, label);

        Scene scene = new Scene(layout, 300, 250);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
