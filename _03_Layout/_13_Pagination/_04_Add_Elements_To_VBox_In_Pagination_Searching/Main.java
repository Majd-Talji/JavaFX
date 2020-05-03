package _03_Layout._13_Pagination._04_Add_Elements_To_VBox_In_Pagination_Searching;

import java.util.ArrayList;
import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.Pagination;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    int itemsPerPage = 3;

    ArrayList<String> dataList = getSearchResult();

    public ArrayList<String> getSearchResult() {
        ArrayList<String> titles = new ArrayList<>();
        titles.add("Title 1");
        titles.add("Title 2");
        titles.add("Title 3");
        titles.add("Title 4");
        titles.add("Title 5");
        titles.add("Title 6");
        titles.add("Title 7");
        titles.add("Title 8");
        return titles;
    }

    public int getNumberOfPages() {
        double totalItems = dataList.size();

        if (totalItems == 0) {
            return 1;
        }

        if (totalItems % itemsPerPage == 0) {
            return (int) (totalItems / itemsPerPage);
        } else {
            return (int) (totalItems / itemsPerPage) + 1;
        }
    }

    public VBox createPage(Integer pageIndex) {
        VBox vBox = new VBox();

        int nextItemIndex = pageIndex * itemsPerPage;

        while (vBox.getChildren().size() < itemsPerPage) {
            try {
                VBox elementBox = new VBox();
                elementBox.setStyle(
                        "-fx-border-width: 0 0 1 0;"
                        + "-fx-border-color: #f1f1f1;"
                        + "-fx-padding: 5px;"
                );

                Hyperlink link = new Hyperlink(dataList.get(nextItemIndex));
                Label text = new Label("Description for " + link.getText());

                elementBox.getChildren().addAll(link, text);
                vBox.getChildren().add(elementBox);

                nextItemIndex++;
            } catch (Exception e) {
                break;
            }
        }

        return vBox;
    }

    @Override
    public void start(Stage stage) {

        AnchorPane root = new AnchorPane();

        Pagination pagination = new Pagination();

        pagination.setPageCount(getNumberOfPages());

        pagination.setPageFactory((Integer pageIndex) -> createPage(pageIndex));

        pagination.setStyle("-fx-background-color: white; -fx-border-color: lightgray");

        pagination.getStyleClass().add(Pagination.STYLE_CLASS_BULLET);

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
