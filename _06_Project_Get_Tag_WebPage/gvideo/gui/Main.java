package _06_Project_Get_Tag_WebPage.gvideo.gui;

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

    @Override
    public void start(Stage stage) throws Exception {

        Parent layout = FXMLLoader.load(getClass().getResource("testGui.fxml"));

        Scene scene = new Scene(layout);
        stage.setTitle("YouTube Player");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }

}
