package _06_Project_Get_Tag_WebPage.test;

import _06_Project_Get_Tag_WebPage.gvideo.platforms_youtube.YouTubeVideo;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class FirstVideoTest extends Application {

    @Override
    public void start(Stage stage) {

        YouTubeVideo video = new YouTubeVideo("pMTTOKXlG4c");
        Node videoNode = video.createNode();

        BorderPane parent = new BorderPane(videoNode);

        Scene scene = new Scene(parent, 400, 250);
        stage.setTitle("YouTube Player");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
