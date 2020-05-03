package _02_Tools_Basic._12_TableView._06_Add_ChoiceBox_To_Table;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.ChoiceBoxTableCell;
import javafx.util.Callback;

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
    
    public static <S, T> Callback<TableColumn<S, T>, TableCell<S, T>> forTableColumn(T... items) {
        return new Callback<TableColumn<S, T>, TableCell<S, T>>() {
            
            private Callback<TableColumn<S, T>, TableCell<S, T>> callback = ChoiceBoxTableCell.forTableColumn(items);
            
            @Override
            public TableCell<S, T> call(TableColumn<S, T> param) {
                
                ChoiceBoxTableCell<S, T> cell = (ChoiceBoxTableCell<S, T>)this.callback.call(param);
                cell.setEditable(true);
                return cell;
                
            }
            
        };
    }

}
