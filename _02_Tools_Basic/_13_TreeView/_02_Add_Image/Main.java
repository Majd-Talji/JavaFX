package _02_Tools_Basic._13_TreeView._02_Add_Image;

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

    public ImageView getDepartmentIcon() {
        return new ImageView(new Image(getClass().getResourceAsStream("department-icon.png")));
    }

    public ImageView getUserMaleIcon() {
        return new ImageView(new Image(getClass().getResourceAsStream("user-male-icon.png")));
    }

    public ImageView getUserFemaleIcon() {
        return new ImageView(new Image(getClass().getResourceAsStream("user-female-icon.png")));
    }

    @Override
    public void start(Stage stage) {

        TreeItem<String> rootItem = new TreeItem<>("Majd Talji", getRootIcon());

        TreeItem dep_1 = new TreeItem("Research & Development", getDepartmentIcon());
        TreeItem dep_2 = new TreeItem("Accounting & Finance", getDepartmentIcon());
        TreeItem dep_3 = new TreeItem("Marketing", getDepartmentIcon());

        TreeItem user_1 = new TreeItem("Majd Talji", getUserMaleIcon());
        TreeItem user_2 = new TreeItem("Manar Talji", getUserMaleIcon());
        TreeItem user_3 = new TreeItem("Alaa Abu-shadeh", getUserFemaleIcon());
        TreeItem user_4 = new TreeItem("Hanan Talji", getUserFemaleIcon());
        TreeItem user_5 = new TreeItem("Hanin Talji", getUserFemaleIcon());
        TreeItem user_6 = new TreeItem("Alaa Abu-shadeh", getUserMaleIcon());

        rootItem.setExpanded(true);

        TreeView<String> treeView = new TreeView<>(rootItem);

        rootItem.getChildren().add(dep_1);
        rootItem.getChildren().add(dep_2);
        rootItem.getChildren().add(dep_3);

        dep_1.getChildren().add(user_1);
        dep_1.getChildren().add(user_2);
        dep_1.getChildren().add(user_3);
        dep_2.getChildren().add(user_4);
        dep_2.getChildren().add(user_5);
        dep_3.getChildren().add(user_6);

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
