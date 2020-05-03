package _02_Tools_Basic._05_TextArea._01_Object_TextArea;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application{
    
    @Override
    public void start(Stage stage) {
        
        TextArea textArea = new TextArea();
        
        textArea.setTranslateX(100);
        textArea.setTranslateY(70);
        
        textArea.setPrefSize(200, 100);
        
        Group root = new Group();
        
        root.getChildren().add(textArea);
        
        Scene scene = new Scene(root, 400, 250);
        
        stage.setTitle("JavaFX TextArea");
        
        stage.setScene(scene);
        
        stage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
