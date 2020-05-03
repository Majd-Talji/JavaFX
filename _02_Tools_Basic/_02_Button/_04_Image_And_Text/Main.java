package _02_Tools_Basic._02_Button._04_Image_And_Text;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
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
        
        Button button_1 = new Button("Button 1", new ImageView(image));
        Button button_2 = new Button("Button 2", new ImageView(image));
        Button button_3 = new Button("Button 3", new ImageView(image));
        Button button_4 = new Button("Button 4", new ImageView(image));
        Button button_5 = new Button("Button 5", new ImageView(image));
        Button button_6 = new Button("Button 6", new ImageView(image));
        Button button_7 = new Button("Button 7", new ImageView(image));
        
        button_1.setContentDisplay(ContentDisplay.LEFT);
        button_2.setContentDisplay(ContentDisplay.RIGHT);
        button_3.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        button_4.setContentDisplay(ContentDisplay.TOP);
        button_5.setContentDisplay(ContentDisplay.BOTTOM);
        button_6.setContentDisplay(ContentDisplay.CENTER);
        button_7.setContentDisplay(ContentDisplay.TEXT_ONLY);
        
        button_1.setTranslateX(30);
        button_1.setTranslateY(50);
        
        button_2.setTranslateX(170);
        button_2.setTranslateY(50);
        
        button_3.setTranslateX(310);
        button_3.setTranslateY(50);
        
        button_4.setTranslateX(30);
        button_4.setTranslateY(130);
        
        button_5.setTranslateX(120);
        button_5.setTranslateY(130);
        
        button_6.setTranslateX(210);
        button_6.setTranslateY(130);
        
        button_7.setTranslateX(300);
        button_7.setTranslateY(130);
        
        Group root = new Group();
        
        root.getChildren().add(button_1);
        root.getChildren().add(button_2);
        root.getChildren().add(button_3);
        root.getChildren().add(button_4);
        root.getChildren().add(button_5);
        root.getChildren().add(button_6);
        root.getChildren().add(button_7);
        
        Scene scene = new Scene(root, 400, 250);
        
        stage.setTitle("JavaFX Button");
        
        stage.setScene(scene);
        
        stage.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }

}
