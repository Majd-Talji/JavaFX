package _02_Tools_Basic._19_Separator._04_Style_CSS_Separator;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Image image1 = new Image(getClass().getResourceAsStream("status-weather-clear.png"));
        Image image2 = new Image(getClass().getResourceAsStream("status-weather-clouds.png"));
        Image image3 = new Image(getClass().getResourceAsStream("status-weather-showers-day.png"));

        Label label_title = new Label("Weather Forecast");
        Label label_mon = new Label("Monday");
        Label label_tue = new Label("Tuesday");
        Label label_wed = new Label("Wednesday");
        Label label_mon_temp = new Label("34", new ImageView(image1));
        Label label_tue_temp = new Label("28", new ImageView(image2));
        Label label_wed_temp = new Label("22", new ImageView(image3));
        Separator horizantalSeparator = new Separator(Orientation.HORIZONTAL);
        Separator verticalSeparator1 = new Separator(Orientation.VERTICAL);
        Separator verticalSeparator2 = new Separator(Orientation.VERTICAL);

        label_title.setTranslateX(50);
        label_title.setTranslateY(45);
        label_mon.setTranslateX(50);
        label_mon.setTranslateY(85);
        label_tue.setTranslateX(150);
        label_tue.setTranslateY(85);
        label_wed.setTranslateX(250);
        label_wed.setTranslateY(85);
        label_mon_temp.setTranslateX(50);
        label_mon_temp.setTranslateY(110);
        label_tue_temp.setTranslateX(150);
        label_tue_temp.setTranslateY(110);
        label_wed_temp.setTranslateX(250);
        label_wed_temp.setTranslateY(110);
        horizantalSeparator.setTranslateX(50);
        horizantalSeparator.setTranslateY(80);
        verticalSeparator1.setTranslateX(150);
        verticalSeparator1.setTranslateY(80);
        verticalSeparator2.setTranslateX(250);
        verticalSeparator2.setTranslateY(80);

        label_title.setPrefSize(300, 30);
        label_mon.setPrefSize(100, 30);
        label_tue.setPrefSize(100, 30);
        label_wed.setPrefSize(100, 30);
        label_mon_temp.setPrefSize(100, 30);
        label_tue_temp.setPrefSize(100, 30);
        label_wed_temp.setPrefSize(100, 30);
        horizantalSeparator.setPrefWidth(300);
        verticalSeparator1.setPrefHeight(100);
        verticalSeparator2.setPrefHeight(100);

        label_title.setStyle("-fx-font-weight: bold;");
        label_mon.setStyle("-fx-font-weight: bold;");
        label_tue.setStyle("-fx-font-weight: bold;");
        label_wed.setStyle("-fx-font-weight: bold;");
        label_mon_temp.setStyle("-fx-font-weight: bold;");
        label_tue_temp.setStyle("-fx-font-weight: bold;");
        label_wed_temp.setStyle("-fx-font-weight: bold;");
        
        label_title.setAlignment(Pos.CENTER);
        label_mon.setAlignment(Pos.CENTER);
        label_tue.setAlignment(Pos.CENTER);
        label_wed.setAlignment(Pos.CENTER);
        label_mon_temp.setAlignment(Pos.CENTER);
        label_tue_temp.setAlignment(Pos.CENTER);
        label_wed_temp.setAlignment(Pos.CENTER);

        Group root = new Group();

        root.getChildren().add(horizantalSeparator);
        root.getChildren().add(verticalSeparator1);
        root.getChildren().add(verticalSeparator2);
        root.getChildren().add(label_title);
        root.getChildren().add(label_mon);
        root.getChildren().add(label_tue);
        root.getChildren().add(label_wed);
        root.getChildren().add(label_mon_temp);
        root.getChildren().add(label_tue_temp);
        root.getChildren().add(label_wed_temp);

        Scene scene = new Scene(root, 400, 250);

        scene.getStylesheets().add("_02_Tools_Basic/_19_Separator/_04_Style_CSS_Separator/css/my-style.css");

        stage.setTitle("JavaFX Separator");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
