package _02_Tools_Basic._12_TableView._03_View_Data_Products;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        TableView table = new TableView();

        ObservableList<Product> data = FXCollections.observableArrayList(
                new Product("Laptop", 800.0, 3),
                new Product("Camera", 199.99, 12),
                new Product("Hard Disk", 79.99, 8),
                new Product("Projector", 240.55, 7),
                new Product("PC Screen", 120.00, 6),
                new Product("Speakers", 33.00, 10),
                new Product("Headphones", 12.50, 4),
                new Product("Microphone", 24.75, 5)
        );

        TableColumn columnName = new TableColumn("Name");
        TableColumn columnPrice = new TableColumn("Price ($)");
        TableColumn columnQuantity = new TableColumn("Quantity");

        table.getColumns().addAll(columnName, columnPrice, columnQuantity);

        table.setItems(data);

        columnName.setCellValueFactory(new PropertyValueFactory<>("name"));

        columnPrice.setCellValueFactory(new PropertyValueFactory<>("price"));

        columnQuantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        table.setPrefSize(440, 300);

        columnName.setPrefWidth(144);
        columnPrice.setPrefWidth(144);
        columnQuantity.setPrefWidth(150);

        table.setTranslateX(10);
        table.setTranslateY(10);

        Group root = new Group();

        root.getChildren().add(table);

        Scene scene = new Scene(root, 460, 320);

        stage.setTitle("JavaFX TableView");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
