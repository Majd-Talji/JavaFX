package _02_Tools_Basic._04_PasswordField._01_Object_PasswordField;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application{
    
    @Override
    public void start(Stage stage) {
        
        PasswordField passwordField = new PasswordField();
        
        passwordField.setTranslateX(100);
        passwordField.setTranslateY(110);
        
        passwordField.setPrefWidth(200);
        
        Group root = new Group();
        
        root.getChildren().add(passwordField);
        
        Scene scene = new Scene(root, 400, 250);
        
        stage.setTitle("JavaFX PasswordField");
        
        stage.setScene(scene);
        
        stage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
