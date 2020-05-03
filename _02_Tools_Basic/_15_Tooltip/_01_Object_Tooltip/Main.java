package _02_Tools_Basic._15_Tooltip._01_Object_Tooltip;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application{
    
    @Override
    public void start(Stage stage) {
        
        PasswordField passwordField = new PasswordField();
        
        Tooltip tooltip = new Tooltip("Password should be at lease 8 characters");
        
        passwordField.setTooltip(tooltip);
        
        passwordField.setTranslateX(100);
        passwordField.setTranslateY(110);
        
        passwordField.setPrefWidth(200);
        
        Group root = new Group();
        
        root.getChildren().add(passwordField);
        
        Scene scene = new Scene(root, 400, 250);
        
        stage.setTitle("JavaFX Tooltip");
        
        stage.setScene(scene);
        
        stage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
