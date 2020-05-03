package _02_Tools_Basic._06_ToggleButton._04_ToggleGroup_Image;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.geometry.NodeOrientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Text Align");

        ToggleButton tg_L = new ToggleButton("", new ImageView(new Image(getClass().getResourceAsStream("align-left.png"))));
        ToggleButton tg_R = new ToggleButton("", new ImageView(new Image(getClass().getResourceAsStream("align-right.png"))));

        TextArea textArea = new TextArea();

        label.setTranslateX(30);
        label.setTranslateY(20);
        tg_L.setTranslateX(130);
        tg_L.setTranslateY(20);
        tg_R.setTranslateX(170);
        tg_R.setTranslateY(20);
        textArea.setTranslateX(20);
        textArea.setTranslateY(60);

        label.setFont(new Font("Arial", 18));

        textArea.setFont(new Font("Arial", 18));
        textArea.setWrapText(true);
        textArea.setPrefSize(360, 140);

        ToggleGroup group = new ToggleGroup();
        tg_L.setToggleGroup(group);
        tg_R.setToggleGroup(group);

        group.selectToggle(tg_L);

        Group root = new Group();

        root.getChildren().add(label);
        root.getChildren().add(tg_L);
        root.getChildren().add(tg_R);
        root.getChildren().add(textArea);

        Scene scene = new Scene(root, 400, 220);

        stage.setTitle("JavaFX ToggleButton");

        stage.setScene(scene);

        stage.show();

        group.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle t, Toggle t1) -> {
            
            if (group.getSelectedToggle().equals(tg_L)) {
                textArea.setNodeOrientation(NodeOrientation.LEFT_TO_RIGHT);
            } else {
                textArea.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
            }
            
        });
        
    }

    public static void main(String[] args) {
        launch(args);
    }

}
