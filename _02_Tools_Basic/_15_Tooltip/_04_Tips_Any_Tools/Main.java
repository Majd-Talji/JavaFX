package _02_Tools_Basic._15_Tooltip._04_Tips_Any_Tools;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    Label label = new Label("Available courses");
    CheckBox cb1 = new CheckBox("Algorithms and Data Structure ( 100$ )");
    CheckBox cb2 = new CheckBox("Web design using HTML, CSS and JS ( 150$ )");
    CheckBox cb3 = new CheckBox("Web Development using PHP and MYSQL ( 200$ )");
    Label resultLabel = new Label("Total Price: 0.0$");

    double price = 0;

    public void setPrice() {

        price = 0;

        if (cb1.isSelected()) {
            price += 100;
        }

        if (cb2.isSelected()) {
            price += 150;
        }

        if (cb3.isSelected()) {
            price += 200;
        }

        resultLabel.setText("Total Price: " + price + "$");

    }

    @Override
    public void start(Stage stage) {

        cb1.setTooltip(new Tooltip("100 $"));
        cb2.setTooltip(new Tooltip("150 $"));
        cb3.setTooltip(new Tooltip("200 $"));

        label.setTranslateX(40);
        label.setTranslateY(30);

        cb1.setTranslateX(40);
        cb1.setTranslateY(75);

        cb2.setTranslateX(40);
        cb2.setTranslateY(110);

        cb3.setTranslateX(40);
        cb3.setTranslateY(145);

        resultLabel.setTranslateX(40);
        resultLabel.setTranslateY(190);

        Group root = new Group();

        Font newFont = new Font("Arial", 16);

        label.setFont(newFont);
        resultLabel.setFont(newFont);
        resultLabel.setTextFill(Color.GREEN);

        root.getChildren().add(label);
        root.getChildren().add(cb1);
        root.getChildren().add(cb2);
        root.getChildren().add(cb3);
        root.getChildren().add(resultLabel);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX Tooltip");

        stage.setScene(scene);

        stage.show();

        cb1.selectedProperty().addListener((ObservableValue<? extends Boolean> ov, Boolean t, Boolean t1) -> {
            setPrice();
        });

        cb2.selectedProperty().addListener((ObservableValue<? extends Boolean> ov, Boolean t, Boolean t1) -> {
            setPrice();
        });

        cb3.selectedProperty().addListener((ObservableValue<? extends Boolean> ov, Boolean t, Boolean t1) -> {
            setPrice();
        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
