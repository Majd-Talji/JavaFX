package _02_Tools_Basic._14_Slider._04_Events_Change_Value;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Selected Value");
        TextField textField = new TextField("0");
        Slider slider = new Slider();

        slider.setMin(0);
        slider.setMax(100);
        slider.setValue(0);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(20);
        slider.setMinorTickCount(5);
        slider.setBlockIncrement(10);

        textField.setEditable(false);

        slider.setPrefSize(200, 40);
        label.setPrefSize(100, 20);
        textField.setPrefSize(40, 20);

        slider.setTranslateX(100);
        slider.setTranslateY(90);
        label.setTranslateX(140);
        label.setTranslateY(170);
        textField.setTranslateX(240);
        textField.setTranslateY(170);

        Group root = new Group();

        root.getChildren().add(slider);
        root.getChildren().add(label);
        root.getChildren().add(textField);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX Slider");

        stage.setScene(scene);

        stage.show();

        slider.valueProperty().addListener((ObservableValue<? extends Number> ov, Number oldValue, Number newValue) -> {
            
            textField.setText("" + newValue.intValue());

        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
