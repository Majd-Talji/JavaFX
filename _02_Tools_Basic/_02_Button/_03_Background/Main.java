package _02_Tools_Basic._02_Button._03_Background;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
        
        Button button = new Button("Black Button");
        
        button.setTranslateX(135);
        button.setTranslateY(100);
        
        button.setFont(new Font("Arial", 20));
        
        button.setTextFill(Color.CYAN);
        
        button.setBackground(new Background(new BackgroundFill(Color.BLACK, new CornerRadii(5), Insets.EMPTY)));
        
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
