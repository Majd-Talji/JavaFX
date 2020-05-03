package _02_Tools_Basic._25_MenuBar._04_RadioMenuItem_CheckMenuItem;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
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

        CheckMenuItem connect = new CheckMenuItem("Connect");
        CheckMenuItem recieveNotifications = new CheckMenuItem("Recieve Notifications");

        RadioMenuItem isAvailable = new RadioMenuItem("Available");
        RadioMenuItem isBusy = new RadioMenuItem("Busy");
        RadioMenuItem isAway = new RadioMenuItem("Away");

        MenuItem exit = new MenuItem("Exit");

        ToggleGroup group = new ToggleGroup();

        isAvailable.setToggleGroup(group);
        isBusy.setToggleGroup(group);
        isAway.setToggleGroup(group);

        connect.setSelected(true);
        isAvailable.setSelected(true);

        menuBar.getMenus().add(menu);

        menu.getItems().add(connect);
        menu.getItems().add(recieveNotifications);
        menu.getItems().add(new SeparatorMenuItem());
        menu.getItems().add(isAvailable);
        menu.getItems().add(isBusy);
        menu.getItems().add(isAway);
        menu.getItems().add(new SeparatorMenuItem());
        menu.getItems().add(exit);

        menuBar.setPrefWidth(400);

        Group root = new Group();

        root.getChildren().add(menuBar);

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("JavaFX MenuBar");

        stage.setScene(scene);

        stage.show();
        
        exit.setOnAction((event) -> {
            System.exit(0);
        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
