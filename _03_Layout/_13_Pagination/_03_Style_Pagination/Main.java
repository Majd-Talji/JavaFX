package _03_Layout._13_Pagination._03_Style_Pagination;

import java.util.ArrayList;
import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Pagination;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    int itemsPerPage = 7;

    ArrayList<String> dataList = getFonts();

    public ArrayList<String> getFonts() {
        return new ArrayList(Arrays.asList(Font.getFamilies().toArray(new String[]{})));
    }

    public int getNumberOfPages() {
        double totalItems = dataList.size();

        if (totalItems % itemsPerPage == 0) {
            return (int) (totalItems / itemsPerPage);
        } else {
            return (int) (totalItems / itemsPerPage) + 1;
        }
    }

    public VBox createPage(Integer pageIndex) {
        VBox vBox = new VBox(5);
        
        int nextItemIndex = pageIndex * itemsPerPage;
        
        while (vBox.getChildren().size() < itemsPerPage) {            
            try {
                Label label = new Label(dataList.get(nextItemIndex));
                label.setStyle("-fx-padding: 0 0 0 5;");
                
                vBox.getChildren().add(label);
                
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
