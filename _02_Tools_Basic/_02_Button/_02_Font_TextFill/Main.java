package _02_Tools_Basic._02_Button._02_Font_TextFill;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application{
    
    @Override
    public void start(Stage stage) {
        
        Button button = new Button("Red Button");
        
        button.setTranslateX(135);
        button.setTranslateY(100);
        
        button.setFont(new Font("Arial", 20));
        
        button.setTextFill(Color.RED);
        
        Group root = new Group();
        
        root.getChildren().add(button);
        
        Scene scene = new Scene(root, 400, 250);
        
        stage.setTitle("JavaFX Button");
        
        stage.setScene(scene);
        
        stage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
