package _02_Tools_Basic._25_MenuBar._05_Add_Menu_in_Menu;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        MenuBar menuBar = new MenuBar();

        Menu menu = new Menu("Menu");
        Menu subJMenu = new Menu("Sub Menu");

        MenuItem item1 = new MenuItem("Item 1");
        MenuItem item2 = new MenuItem("Item 2");
        MenuItem item3 = new MenuItem("Item 3");
        MenuItem item4 = new MenuItem("Item 4");
        MenuItem item5 = new MenuItem("Item 5");
        MenuItem item6 = new MenuItem("Item 6");
        MenuItem item7 = new MenuItem("Item 7");
        MenuItem item8 = new MenuItem("Item 8");
        MenuItem item9 = new MenuItem("Item 9");

        menuBar.getMenus().add(menu);

        menu.getItems().add(item1);
        menu.getItems().add(item2);
        menu.getItems().add(item3);

        menu.getItems().add(subJMenu);

        subJMenu.getItems().add(item4);
        subJMenu.getItems().add(item5);
        subJMenu.getItems().add(item6);
        subJMenu.getItems().add(item7);
        subJMenu.getItems().add(item8);
        subJMenu.getItems().add(item9);

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
