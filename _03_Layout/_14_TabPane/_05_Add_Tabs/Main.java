package _03_Layout._14_TabPane._05_Add_Tabs;

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

        String[] colors = new String[]{
            ("-fx-background-color: white;"),
            ("-fx-background-color: cyan;"),
            ("-fx-background-color: yellow;"),
            ("-fx-background-color: green;"),
            ("-fx-background-color: brown;"),};

        for (int i = 0; i < colors.length; i++) {
            Pane pane = new Pane();
            pane.setStyle(colors[i]);

            Tab tab = new Tab();
            tab = new Tab("Tab " + (i + 1));
            tab.setContent(pane);

            InputStream imgUrl = Main.class.getResourceAsStream("tab-icon.png");
            ImageView icon = new ImageView(new Image(imgUrl));
            tab.setGraphic(icon);

            tabPane.getTabs().add(tab);
        }

        tabPane.getSelectionModel().select(0);

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
