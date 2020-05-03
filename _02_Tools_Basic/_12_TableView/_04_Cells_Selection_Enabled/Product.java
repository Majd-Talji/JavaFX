package _02_Tools_Basic._12_TableView._04_Cells_Selection_Enabled;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Product {

    SimpleStringProperty name;
    SimpleDoubleProperty price;
    SimpleIntegerProperty quantity;

    public Product() {
        this.name = new SimpleStringProperty("");
        this.price = new SimpleDoubleProperty(0.0);
        this.quantity = new SimpleIntegerProperty(0);
    }

    public Product(String name, double price, int quantity) {
        this.name = new SimpleStringProperty(name);
        this.price = new SimpleDoubleProperty(price);
        this.quantity = new SimpleIntegerProperty(quantity);
    }

    public String getName() {
        return name.getValue();
    }

    public void setName(String name) {
        this.name = new SimpleStringProperty(name);
    }

    public double getPrice() {
        return price.getValue();
    }

    public void setPrice(double price) {
        this.price = new SimpleDoubleProperty(price);
    }

    public int getQuantity() {
        return quantity.getValue();
    }

    public void setQuantity(int quantity) {
        this.quantity = new SimpleIntegerProperty(quantity);
    }

}
