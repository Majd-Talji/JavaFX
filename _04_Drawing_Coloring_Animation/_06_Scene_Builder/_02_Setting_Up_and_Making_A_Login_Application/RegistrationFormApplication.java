package _04_Drawing_Coloring_Animation._06_Scene_Builder._02_Setting_Up_and_Making_A_Login_Application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class RegistrationFormApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("registration_form.fxml"));
        stage.setTitle("Registration From FXML App");        
        Scene scene = new Scene(root, 800, 500);        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(RegistrationFormApplication.class, args);
    }
}