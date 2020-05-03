package _03_Layout._13_Pagination._01_Object_Pagination_In_AnchorPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Pagination;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        AnchorPane root = new AnchorPane();

        Pagination pagination = new Pagination();

        pagination.setStyle("-fx-background-color: white; -fx-border-color: lightgray");

        AnchorPane.setTopAnchor(pagination, 20.0);
        AnchorPane.setRightAnchor(pagination, 20.0);
        AnchorPane.setLeftAnchor(pagination, 20.0);
        AnchorPane.setBottomAnchor(pagination, 20.0);

        root.getChildren().add(pagination);

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("JavaFX Pagination");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
