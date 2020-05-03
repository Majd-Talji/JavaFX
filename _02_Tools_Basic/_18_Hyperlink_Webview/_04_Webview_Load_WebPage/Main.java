package _02_Tools_Basic._18_Hyperlink_Webview._04_Webview_Load_WebPage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Image image1 = new Image(getClass().getResourceAsStream("google.png"));
        Image image2 = new Image(getClass().getResourceAsStream("youtube.png"));
        Image image3 = new Image(getClass().getResourceAsStream("facebook.png"));
        Image image4 = new Image(getClass().getResourceAsStream("twitter.png"));

        Hyperlink link1 = new Hyperlink("Google", new ImageView(image1));
        Hyperlink link2 = new Hyperlink("Youtube", new ImageView(image2));
        Hyperlink link3 = new Hyperlink("Facebook", new ImageView(image3));
        Hyperlink link4 = new Hyperlink("Twitter", new ImageView(image4));

        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();

        link1.setContentDisplay(ContentDisplay.LEFT);
        link2.setContentDisplay(ContentDisplay.LEFT);
        link3.setContentDisplay(ContentDisplay.LEFT);
        link4.setContentDisplay(ContentDisplay.LEFT);

        link1.setTranslateX(456);
        link1.setTranslateY(10);
        link2.setTranslateX(312);
        link2.setTranslateY(10);
        link3.setTranslateX(168);
        link3.setTranslateY(10);
        link4.setTranslateX(24);
        link4.setTranslateY(10);
        webView.setTranslateX(0);
        webView.setTranslateY(60);

        link1.setPrefSize(120, 34);
        link2.setPrefSize(120, 34);
        link3.setPrefSize(120, 34);
        link4.setPrefSize(120, 34);
        webView.setPrefSize(600, 440);

        link1.setUnderline(false);
        link2.setUnderline(false);
        link3.setUnderline(false);
        link4.setUnderline(false);

        link1.setFont(new Font("Tahoma", 16));
        link2.setFont(new Font("Tahoma", 16));
        link3.setFont(new Font("Tahoma", 16));
        link4.setFont(new Font("Tahoma", 16));

        link1.setTextFill(Color.DARKCYAN);
        link2.setTextFill(Color.DARKCYAN);
        link3.setTextFill(Color.DARKCYAN);
        link4.setTextFill(Color.DARKCYAN);

        link1.setAlignment(Pos.CENTER_LEFT);
        link2.setAlignment(Pos.CENTER_LEFT);
        link3.setAlignment(Pos.CENTER_LEFT);
        link4.setAlignment(Pos.CENTER_LEFT);

        Group root = new Group();

        root.getChildren().add(link1);
        root.getChildren().add(link2);
        root.getChildren().add(link3);
        root.getChildren().add(link4);
        root.getChildren().add(webView);

        Scene scene = new Scene(root, 600, 500);

        stage.setTitle("JavaFX Hyperlink & WebView");

        stage.setScene(scene);

        stage.show();

        webEngine.load("https://google.com");

        link1.setOnAction((ActionEvent e) -> {
            webEngine.load("https://google.com");
        });

        link2.setOnAction((ActionEvent e) -> {
            webEngine.load("https://youtube.com");
        });

        link3.setOnAction((ActionEvent e) -> {
            webEngine.load("https://facebook.com");
        });

        link4.setOnAction((ActionEvent e) -> {
            webEngine.load("https://twitter.com");
        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
