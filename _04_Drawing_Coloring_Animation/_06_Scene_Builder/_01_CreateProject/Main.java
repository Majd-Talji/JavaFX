package _04_Drawing_Coloring_Animation._06_Scene_Builder._01_CreateProject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    // https://gluonhq.com/products/scene-builder/
    // https://www.youtube.com/results?search_query=javafx+gluon+tutorial&sp=EgIQAw%253D%253D
    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        
        stage.setTitle("FXML Sample App");
        
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
