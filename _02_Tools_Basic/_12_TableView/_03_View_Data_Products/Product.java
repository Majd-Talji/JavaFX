package _02_Tools_Basic._12_TableView._03_View_Data_Products;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Product {
    
    String name;
    double price;
    int quantity;

    public Product() {
        this.name = "";
        this.price = 0.0;
        this.quantity = 0;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
}
