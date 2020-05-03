package _02_Tools_Basic._03_TextField._05_Prompt_Text;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {
        
        TextField textField_1 = new TextField();
        TextField textField_2 = new TextField();
        TextField textField_3 = new TextField();
        Button button = new Button("Submit");

        textField_1.setPromptText("First Name");
        textField_2.setPromptText("Last Name");
        textField_3.setPromptText("Email Name");
        
        textField_1.setFocusTraversable(false);
        textField_2.setFocusTraversable(false);
        textField_3.setFocusTraversable(false);
        
        textField_1.setTranslateX(100);
        textField_1.setTranslateY(50);
        textField_2.setTranslateX(100);
        textField_2.setTranslateY(90);
        textField_3.setTranslateX(100);
        textField_3.setTranslateY(130);
        button.setTranslateX(100);
        button.setTranslateY(170);

        textField_1.setPrefWidth(200);
        textField_2.setPrefWidth(200);
        textField_3.setPrefWidth(200);
        textField_2.setPrefWidth(200);
        button.setPrefWidth(200);

        Group root = new Group();

        root.getChildren().add(textField_1);
        root.getChildren().add(textField_2);
        root.getChildren().add(textField_3);
        root.getChildren().add(button);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX TextField");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
