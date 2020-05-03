package _02_Tools_Basic._07_RadioButton._05_Event_Click;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        RadioButton radioButton1 = new RadioButton("Cat");
        RadioButton radioButton2 = new RadioButton("Dog");
        RadioButton radioButton3 = new RadioButton("Bird");
        ImageView imageView = new ImageView();

        radioButton1.setTranslateX(40);
        radioButton1.setTranslateY(50);

        radioButton2.setTranslateX(40);
        radioButton2.setTranslateY(90);

        radioButton3.setTranslateX(40);
        radioButton3.setTranslateY(130);

        imageView.setTranslateX(130);
        imageView.setTranslateY(30);

        ToggleGroup group = new ToggleGroup();
        radioButton1.setToggleGroup(group);
        radioButton2.setToggleGroup(group);
        radioButton3.setToggleGroup(group);

        radioButton1.setUserData("cat.png");
        radioButton2.setUserData("dog.png");
        radioButton3.setUserData("bird.png");

        Group root = new Group();

        root.getChildren().add(radioButton1);
        root.getChildren().add(radioButton2);
        root.getChildren().add(radioButton3);
        root.getChildren().add(imageView);

        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("JavaFX RadioButton");

        stage.setScene(scene);

        stage.show();

        group.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle t, Toggle t1) -> {
            
            if (group.getSelectedToggle() != null) {
                imageView.setImage(new Image(getClass().getResourceAsStream(group.getSelectedToggle().getUserData().toString())));
            }
            
        });

        radioButton1.setSelected(true);

    }

    public static void main(String[] args) {
        launch(args);
    }

}
