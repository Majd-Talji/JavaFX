package _01_Basis._14_Binding._01_Binding_IntegerProperty;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        IntegerProperty x = new SimpleIntegerProperty(5);
        IntegerProperty y = new SimpleIntegerProperty();
        
        y.bind(x.multiply(10));
        System.out.println("x: " + x.getValue());
        System.out.println("y: " + y.getValue());
        
        x.setValue(4);
        System.out.println("x: " + x.getValue());
        System.out.println("y: " + y.getValue());
        
        x.setValue(7);
        System.out.println("x: " + x.getValue());
        System.out.println("y: " + y.getValue());
        
    }
    
}
