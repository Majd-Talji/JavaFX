package _02_Tools_Basic._03_TextField._02_Font_TextFill;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application{
    
    @Override
    public void start(Stage stage) {
        
        TextField textField = new TextField();
        
        textField.setTranslateX(100);
        textField.setTranslateY(110);
        
        textField.setFont(new Font("Arial", 20));
        
        textField.setPrefWidth(200);
        
        Group root = new Group();
        
        root.getChildren().add(textField);
        
        Scene scene = new Scene(root, 400, 250);
        
        stage.setTitle("JavaFX TextField");
        
        stage.setScene(scene);
        
        stage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
