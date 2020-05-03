package _02_Tools_Basic._24_ContextMenu._03_ContextMenu_In_TreeView;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    public ImageView getRootIcon() {
        return new ImageView(new Image(getClass().getResourceAsStream("building-icon.png")));
    }

    @Override
    public void start(Stage stage) {

        TreeItem<String> rootItem = new TreeItem<>("Root Item", getRootIcon());

        TreeView<String> treeView = new TreeView<>(rootItem);

        rootItem.setExpanded(true);

        treeView.setPrefSize(400, 250);

        treeView.setTranslateX(0);
        treeView.setTranslateY(0);

        treeView.setEditable(true);

        treeView.setCellFactory(
                (TreeView<String> p) -> new EditableItem()
        );

        Group root = new Group();

        root.getChildren().add(treeView);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX ContextMenu");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
