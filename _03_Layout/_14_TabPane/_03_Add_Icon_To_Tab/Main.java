package _03_Layout._14_TabPane._03_Add_Icon_To_Tab;

import java.io.InputStream;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {
        TabPane tabPane = new TabPane();
        
        Pane pane1 = new Pane();
        Pane pane2 = new Pane();
        Pane pane3 = new Pane();
        Pane pane4 = new Pane();

        Tab tab1 = new Tab("Pane 1" , pane1);
        Tab tab2 = new Tab("Pane 2" , pane2);
        Tab tab3 = new Tab("Pane 3" , pane3);
        Tab tab4 = new Tab("Pane 4" , pane4);
        
        pane1.setStyle("-fx-background-color: white;");
        pane2.setStyle("-fx-background-color: cyan;");
        pane3.setStyle("-fx-background-color: yellow;");
        pane4.setStyle("-fx-background-color: green;");
        
        InputStream imgUrl = Main.class.getResourceAsStream("tab-icon.png");
        ImageView icon = new ImageView(new Image(imgUrl));
        
        tab1.setGraphic(icon);
        tab2.setGraphic(icon);
        tab3.setGraphic(icon);
        tab4.setGraphic(icon);

        tabPane.getTabs().add(tab1);
        tabPane.getTabs().add(tab2);
        tabPane.getTabs().add(tab3);
        tabPane.getTabs().add(tab4);

        StackPane layout = new StackPane();
        layout.getChildren().add(tabPane);

        Scene scene = new Scene(layout, 400, 250);
        stage.setScene(scene);
        stage.setTitle("JavaFX TabPane");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
