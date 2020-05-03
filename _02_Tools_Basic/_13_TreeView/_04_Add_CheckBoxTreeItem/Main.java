package _02_Tools_Basic._13_TreeView._04_Add_CheckBoxTreeItem;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.CheckBoxTreeCell;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        CheckBoxTreeItem<String> rootItem = new CheckBoxTreeItem<>("Add Features");
        Button button = new Button("Display Selected");
        TextArea textArea = new TextArea();

        TreeView<String> treeView = new TreeView<>(rootItem);

        treeView.setCellFactory(CheckBoxTreeCell.<String>forTreeView());

        CheckBoxTreeItem item1 = new CheckBoxTreeItem<>("Update Automatically");
        CheckBoxTreeItem item2 = new CheckBoxTreeItem<>("Recieve New Offers");
        CheckBoxTreeItem item3 = new CheckBoxTreeItem<>("Arabic Language package");

        rootItem.getChildren().add(item1);
        rootItem.getChildren().add(item2);
        rootItem.getChildren().add(item3);

        rootItem.setExpanded(true);

        textArea.setEditable(false);

        treeView.setPrefSize(400, 100);
        button.setPrefSize(200, 30);
        textArea.setPrefSize(400, 60);

        treeView.setTranslateX(0);
        treeView.setTranslateY(0);
        button.setTranslateX(100);
        button.setTranslateY(130);
        textArea.setTranslateX(0);
        textArea.setTranslateY(190);

        Group root = new Group();

        root.getChildren().add(treeView);
        root.getChildren().add(button);
        root.getChildren().add(textArea);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX TreeView");

        stage.setScene(scene);

        stage.show();

        button.setOnAction((t) -> {

            String selectedItems = "";

            if (((CheckBoxTreeItem) rootItem.getChildren().get(0)).isSelected()) {
                selectedItems += rootItem.getChildren().get(0).getValue() + "\n";
            }

            if (((CheckBoxTreeItem) rootItem.getChildren().get(1)).isSelected()) {
                selectedItems += rootItem.getChildren().get(1).getValue() + "\n";
            }

            if (((CheckBoxTreeItem) rootItem.getChildren().get(2)).isSelected()) {
                selectedItems += rootItem.getChildren().get(2).getValue();
            }

            if (selectedItems.equals("")) {
                selectedItems = "No Feature is Selected";
            }

            textArea.setText(selectedItems);

        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
