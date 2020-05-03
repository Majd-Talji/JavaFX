package _02_Tools_Basic._12_TableView._05_Add_Remove_Item;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class User {

    SimpleStringProperty name;
    SimpleStringProperty role;
    SimpleStringProperty email;

    public User() {
        this.name = new SimpleStringProperty("");
        this.role = new SimpleStringProperty("");
        this.email = new SimpleStringProperty("");
    }

    public User(String name, String role, String email) {
        this.name = new SimpleStringProperty(name);
        this.role = new SimpleStringProperty(role);
        this.email = new SimpleStringProperty(email);
    }

    public String getName() {
        return name.getValue();
    }

    public void setName(String name) {
        this.name = new SimpleStringProperty(name);
    }

    public String getRole() {
        return role.getValue();
    }

    public void setRole(String role) {
        this.role = new SimpleStringProperty(role);
    }

    public String getEmail() {
        return email.getValue();
    }

    public void setEmail(String email) {
        this.role = new SimpleStringProperty(email);
    }

}
