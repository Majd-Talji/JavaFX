package _05_Events._08_ChangeListener_valueProperty;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("ChangeListener valuePerty");

        ScrollBar scrollBar = new ScrollBar();
        Label label = new Label("Scroll Value: 50");

        label.setTranslateX(90);
        label.setTranslateY(90);
        label.setPrefSize(150, 30);

        scrollBar.setTranslateX(40);
        scrollBar.setTranslateY(30);
        scrollBar.setPrefSize(30, 150);

        scrollBar.setMin(1);
        scrollBar.setMax(100);
        scrollBar.setValue(50);
        scrollBar.setVisibleAmount(1);
        scrollBar.setOrientation(Orientation.VERTICAL);

        scrollBar.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                label.setText("Scroll Value: " + (int)scrollBar.getValue());
            }
        });

        Group layout = new Group();
        layout.getChildren().add(scrollBar);
        layout.getChildren().add(label);

        Scene scene = new Scene(layout, 400, 250);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
