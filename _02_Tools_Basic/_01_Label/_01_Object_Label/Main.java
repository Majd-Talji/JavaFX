package _02_Tools_Basic._01_Label._01_Object_Label;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application{
    
    @Override
    public void start(Stage stage) {
        
        Label label = new Label("Welcome to Majd Talji");
        
        label.setTranslateX(180);
        label.setTranslateY(140);
        
        Group root = new Group();
        
        root.getChildren().add(label);
        
        Scene scene = new Scene(root, 500, 300);
        
        stage.setTitle("JavaFX Label");
        
        stage.setScene(scene);
        
        stage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
