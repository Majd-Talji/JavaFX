package _02_Tools_Basic._13_TreeView._01_Object_TreeView_TreeItem;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class MenuFood extends Application {

    @Override
    public void start(Stage stage) {

        TreeItem<String> menu = new TreeItem<>("Menu");

        TreeItem food = new TreeItem("Food");
        TreeItem pizza = new TreeItem("Pizza");
        TreeItem hotDogs = new TreeItem("HotDogs");
        TreeItem chicken = new TreeItem("Chicken");
        TreeItem hamburger = new TreeItem("Hamburger");

        TreeItem drink = new TreeItem("Drink");
        TreeItem pepsi = new TreeItem("Pepsi");
        TreeItem cola = new TreeItem("Cola");
        TreeItem rani = new TreeItem("Rani");
        TreeItem water = new TreeItem("Water");

        menu.getChildren().add(food);
        menu.getChildren().get(0).getChildren().add(pizza);
        menu.getChildren().get(0).getChildren().add(hotDogs);
        menu.getChildren().get(0).getChildren().add(chicken);
        menu.getChildren().get(0).getChildren().add(hamburger);

        menu.getChildren().add(drink);
        menu.getChildren().get(1).getChildren().add(pepsi);
        menu.getChildren().get(1).getChildren().add(cola);
        menu.getChildren().get(1).getChildren().add(rani);
        menu.getChildren().get(1).getChildren().add(water);

        TreeView<String> treeView = new TreeView<>(menu);

        treeView.setPrefSize(400, 250);

        treeView.setTranslateX(0);
        treeView.setTranslateY(0);

        Group root = new Group();

        root.getChildren().add(treeView);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX TreeView");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
