package _02_Tools_Basic._25_MenuBar._03_Add_Icon_To_MenuItem;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
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

        MenuBar menuBar = new MenuBar();

        Menu menuFile = new Menu("File");
        
        MenuItem itemNewFile = new MenuItem("New", new ImageView(new Image(getClass().getResourceAsStream("new-file-icon.png"))));
        MenuItem itemOpen = new MenuItem("Open", new ImageView(new Image(getClass().getResourceAsStream("open-icon.png"))));
        MenuItem itemSave = new MenuItem("Save", new ImageView(new Image(getClass().getResourceAsStream("save-icon.png"))));
        MenuItem itemExit = new MenuItem("Exit", new ImageView(new Image(getClass().getResourceAsStream("exit-icon.png"))));

        menuBar.getMenus().add(menuFile);

        menuFile.getItems().add(itemNewFile);
        menuFile.getItems().add(itemOpen);
        menuFile.getItems().add(itemSave);
        menuFile.getItems().add(new SeparatorMenuItem());
        menuFile.getItems().add(itemExit);
        
        menuBar.setPrefWidth(400);

        Group root = new Group();

        root.getChildren().add(menuBar);

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("JavaFX MenuBar");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
