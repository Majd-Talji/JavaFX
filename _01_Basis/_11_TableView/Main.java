package _01_Basis._11_TableView;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    Stage window;
    TableView<Product> table;
    TextField nameInput, priceInput, quantityInput;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("TableView");

        TableColumn<Product, String> columnName = new TableColumn<>("Name");
        columnName.setMinWidth(200);
        columnName.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Product, Double> columnPrice = new TableColumn("Price ($)");
        columnPrice.setMinWidth(100);
        columnPrice.setCellValueFactory(new PropertyValueFactory<>("price"));

        TableColumn<Product, Integer> columnQuantity = new TableColumn("Quantity");
        columnQuantity.setMinWidth(100);
        columnQuantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        nameInput = new TextField();
        nameInput.setPromptText("Name");
        nameInput.setMinWidth(100);

        priceInput = new TextField();
        priceInput.setPromptText("Price");
        priceInput.setMinWidth(100);

        quantityInput = new TextField();
        quantityInput.setPromptText("Quantity");
        quantityInput.setMinWidth(100);

        Button addButton = new Button("Add");
        addButton.setOnAction(e -> addButtonClicked());
        Button deleteButton = new Button("Delete");
        deleteButton.setOnAction(e -> deleteButtonClicked());

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameInput, priceInput, quantityInput, addButton, deleteButton);

        table = new TableView();
        table.setItems(getProduct());
        table.getColumns().addAll(columnName, columnPrice, columnQuantity);

        VBox layout = new VBox();
        layout.getChildren().addAll(table, hBox);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

    public ObservableList<Product> getProduct() {
        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("Laptop", 800.0, 3));
        products.add(new Product("Camera", 199.99, 12));
        products.add(new Product("Hard Disk", 79.99, 8));
        products.add(new Product("Projector", 240.55, 7));
        products.add(new Product("PC Screen", 120.00, 6));
        products.add(new Product("Speakers", 33.00, 10));
        products.add(new Product("Headphones", 12.50, 4));
        products.add(new Product("Microphone", 24.75, 5));
        return products;
    }

    private void addButtonClicked() {
        Product product = new Product();
        product.setName(nameInput.getText());
        product.setPrice(Double.parseDouble(priceInput.getText()));
        product.setQuantity(Integer.parseInt(quantityInput.getText()));
        table.getItems().add(product);
        nameInput.clear();
        priceInput.clear();
        quantityInput.clear();
    }

    private void deleteButtonClicked() {
        ObservableList<Product> productSelected, allProducts;
        allProducts = table.getItems();
        productSelected = table.getSelectionModel().getSelectedItems();
        
        productSelected.forEach(allProducts::remove);
    }

}
