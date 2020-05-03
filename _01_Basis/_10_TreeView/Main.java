package _01_Basis._10_TreeView;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    Stage window;
    TreeView<String> tree;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("TreeView");

        TreeItem<String> root, food, trink;

        root = new TreeItem<>();
        root.setExpanded(true);

        food = makeTreeItem("pita", root);
        makeTreeItem("pita1", food);
        makeTreeItem("pita2", food);
        makeTreeItem("pita3", food);

        trink = makeTreeItem("p", root);
        makeTreeItem("p1", trink);
        makeTreeItem("p2", trink);

        tree = new TreeView<>(root);
        tree.setShowRoot(false);
        tree.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                System.out.println(newValue.getValue());
            }
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(tree);
        Scene scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();
    }

    private TreeItem<String> makeTreeItem(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }

}
