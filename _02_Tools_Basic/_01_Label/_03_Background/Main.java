package _02_Tools_Basic._01_Label._03_Background;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
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
        
        Label label = new Label("Welcome to Majd Talji");
        
        label.setTranslateX(100);
        label.setTranslateY(120);
        
        label.setFont(new Font("Arial", 24));
        
        label.setTextFill(Color.CYAN);
        
        label.setBackground(new Background(new BackgroundFill(Color.GREY, CornerRadii.EMPTY, Insets.EMPTY)));
        
        label.setPadding(new Insets(10));
        
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
