package _01_Basis._13_Properties;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Person {

    private StringProperty firstName = new SimpleStringProperty();

    public String getFirstName() {
        return firstName.get();
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }
}
