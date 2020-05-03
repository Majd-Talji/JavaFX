package _01_Basis._17_CallBack._02_setCellValueFactory_callBack;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
class Person {

    private StringProperty name, lastName;

    Person(String firstName, String lastName) {
        this.name = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public String getName() {
        return this.name.get();
    }

    public String getLastName() {
        return this.lastName.get();
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public void setName(String name) {
        this.name.set(name);
    }

}
