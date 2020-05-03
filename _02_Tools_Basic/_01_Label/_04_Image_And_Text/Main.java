package _02_Tools_Basic._01_Label._04_Image_And_Text;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
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
        
        Image image = new Image(getClass().getResourceAsStream("smily-face.png"));
        
        Label label_1 = new Label("Label 1", new ImageView(image));
        Label label_2 = new Label("Label 2", new ImageView(image));
        Label label_3 = new Label("Label 3", new ImageView(image));
        Label label_4 = new Label("Label 4", new ImageView(image));
        Label label_5 = new Label("Label 5", new ImageView(image));
        Label label_6 = new Label("Label 6", new ImageView(image));
        Label label_7 = new Label("Label 7", new ImageView(image));
        
        label_1.setContentDisplay(ContentDisplay.LEFT);
        label_2.setContentDisplay(ContentDisplay.BOTTOM);
        label_3.setContentDisplay(ContentDisplay.TOP);
        label_4.setContentDisplay(ContentDisplay.RIGHT);
        label_5.setContentDisplay(ContentDisplay.CENTER);
        label_6.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        label_7.setContentDisplay(ContentDisplay.TEXT_ONLY);
        
        label_1.setTranslateX(20);
        label_1.setTranslateY(50);
        
        label_2.setTranslateX(170);
        label_2.setTranslateY(50);
        
        label_3.setTranslateX(280);
        label_3.setTranslateY(50);
        
        label_4.setTranslateX(390);
        label_4.setTranslateY(50);
        
        label_5.setTranslateX(80);
        label_5.setTranslateY(200);
        
        label_6.setTranslateX(230);
        label_6.setTranslateY(200);
        
        label_7.setTranslateX(370);
        label_7.setTranslateY(200);
        
        Group root = new Group();
        
        root.getChildren().add(label_1);
        root.getChildren().add(label_2);
        root.getChildren().add(label_3);
        root.getChildren().add(label_4);
        root.getChildren().add(label_5);
        root.getChildren().add(label_6);
        root.getChildren().add(label_7);
        
        Scene scene = new Scene(root, 500, 300);
        
        stage.setTitle("JavaFX Label");
        
        stage.setScene(scene);
        
        stage.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }

}
