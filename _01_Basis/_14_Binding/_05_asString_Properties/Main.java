package _01_Basis._14_Binding._05_asString_Properties;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
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

        Button button1 = new Button("bind asString");
        Button button2 = new Button("unbind");

        button1.setOnAction((event) -> {
            label.textProperty().bind(slider.valueProperty().asString());
        });

        button2.setOnAction((event) -> {
            label.textProperty().unbind();
        });

        VBox vBox = new VBox();
        vBox.setPadding(new Insets(10));
        vBox.setSpacing(10);

        vBox.getChildren().addAll(slider, label, button1);
        vBox.getChildren().add(button2);

        Scene scene = new Scene(vBox, 500, 150, Color.WHITE);
        stage.setTitle("bind asString");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
