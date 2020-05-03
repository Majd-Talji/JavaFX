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
public class Main extends Application{
    
    @Override
    public void start(Stage stage) {
        
        TreeItem<String> rootItem = new TreeItem<>("Root");
        
        TreeView<String> treeView = new TreeView<>(rootItem);
        
        TreeItem item0 = new TreeItem("Item 0");
        TreeItem item1 = new TreeItem("Item 1");
        TreeItem item2 = new TreeItem("Item 2");
        
        rootItem.getChildren().add(item0);
        rootItem.getChildren().add(item1);
        rootItem.getChildren().add(item2);
        
        TreeItem item2_0 = new TreeItem("Item 2-0");
        TreeItem item2_1 = new TreeItem("Item 2-1");

        rootItem.getChildren().get(2).getChildren().add(item2_0);
        rootItem.getChildren().get(2).getChildren().add(item2_1);
        
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
