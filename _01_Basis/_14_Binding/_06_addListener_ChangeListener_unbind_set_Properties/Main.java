package _01_Basis._14_Binding._06_addListener_ChangeListener_unbind_set_Properties;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Slider slider = new Slider();
        Label label = new Label();

        label.textProperty().bind(slider.valueProperty().asString());

        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                if (newValue.doubleValue() > slider.getMax() / 2) {
                    label.textProperty().unbind();
                    label.textProperty().set("Maxiume 50");
                } else {
                    label.textProperty().bind(slider.valueProperty().asString());
                }
            }
        });

        VBox vBox = new VBox();
        vBox.setPadding(new Insets(10));
        vBox.setSpacing(10);

        vBox.getChildren().addAll(slider, label);

        Scene scene = new Scene(vBox, 500, 75, Color.WHITE);
        stage.setTitle("bind asString");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
