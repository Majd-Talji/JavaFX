package _03_Layout._11_TitledPane_Accordion._03_Image_In_TitledPane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        FlowPane root = new FlowPane();

        root.setAlignment(Pos.TOP_CENTER);

        ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("godaddy-icon.png")));

        GridPane gridPane = new GridPane();
        gridPane.add(new Label("User"), 0, 0);
        gridPane.add(new TextField(), 1, 0);
        gridPane.add(new Label("Password"), 0, 1);
        gridPane.add(new TextField(), 1, 1);
        
        gridPane.setPadding(new Insets(5));
        
        gridPane.setHgap(5);
        
        gridPane.setVgap(5);

        TitledPane titledPane1 = new TitledPane("Image inside", imageView);
        TitledPane titledPane2 = new TitledPane("GridPane inside", gridPane);

        Accordion accordion = new Accordion(titledPane1, titledPane2);

        root.getChildren().add(accordion);

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("JavaFX TitledPane & Accordion");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
