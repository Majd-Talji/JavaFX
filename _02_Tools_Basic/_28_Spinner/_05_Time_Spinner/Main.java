package _02_Tools_Basic._28_Spinner._05_Time_Spinner;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    Label label = new Label("Enter Time: ");
    SpinnerValueFactory<Integer> hours = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 12, 1);
    Spinner hoursSpinner = new Spinner(hours);
    SpinnerValueFactory<Integer> minutes = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 59, 1);
    Spinner minutesSpinner = new Spinner(minutes);
    SpinnerValueFactory<Integer> seconds = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 59, 1);
    Spinner secondsSpinner = new Spinner(seconds);
    ObservableList<String> amOrPm = FXCollections.observableArrayList("AM", "PM");
    Spinner amOrPmSpinner = new Spinner(amOrPm);
    Button btn = new Button("Display Time");
    Label enteredTime = new Label();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {


        label.setTranslateX(40);
        label.setTranslateY(40);
        label.setPrefSize(100, 22);

        hoursSpinner.setTranslateX(130);
        hoursSpinner.setTranslateY(40);
        hoursSpinner.setPrefSize(55, 22);

        minutesSpinner.setTranslateX(200);
        minutesSpinner.setTranslateY(40);
        minutesSpinner.setPrefSize(55, 22);
        minutes.setValue(Integer.MIN_VALUE);

        secondsSpinner.setTranslateX(270);
        secondsSpinner.setTranslateY(40);
        secondsSpinner.setPrefSize(55, 22);
        seconds.setValue(Integer.MIN_VALUE);

        amOrPmSpinner.setTranslateX(340);
        amOrPmSpinner.setTranslateY(40);
        amOrPmSpinner.setPrefSize(60, 22);

        btn.setTranslateX(40);
        btn.setTranslateY(100);
        btn.setPrefSize(110, 22);

        enteredTime.setTranslateX(170);
        enteredTime.setTranslateY(100);
        enteredTime.setPrefSize(200, 30);

        btn.setOnAction((event) -> {
                enteredTime.setText(hoursSpinner.getValue().toString() + ":" + minutesSpinner.getValue().toString() + ":" + secondsSpinner.getValue().toString() + " " + amOrPmSpinner.getValue().toString());
        });
        
        Group layout = new Group();
        layout.getChildren().add(label);
        layout.getChildren().add(hoursSpinner);
        layout.getChildren().add(minutesSpinner);
        layout.getChildren().add(secondsSpinner);
        layout.getChildren().add(amOrPmSpinner);
        layout.getChildren().add(btn);
        layout.getChildren().add(enteredTime);

        Scene scene = new Scene(layout, 470, 250);
        stage.setTitle("Spinner Demo");
        stage.setScene(scene);
        stage.show();
    }

}
