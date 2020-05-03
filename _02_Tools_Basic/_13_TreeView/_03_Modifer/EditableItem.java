package _02_Tools_Basic._13_TreeView._03_Modifer;

import javafx.event.ActionEvent;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class EditableItem extends TreeCell<String> {

    public ImageView getDepartmentIcon() {
        return new ImageView(new Image(getClass().getResourceAsStream("department-icon.png")));
    }

    public ImageView getUserMaleIcon() {
        return new ImageView(new Image(getClass().getResourceAsStream("user-male-icon.png")));
    }

    public ImageView getUserFemaleIcon() {
        return new ImageView(new Image(getClass().getResourceAsStream("user-female-icon.png")));
    }

    private TextField textField;

    private final ContextMenu menuForRootItem = new ContextMenu();

    private final ContextMenu menuForAnyDepartment = new ContextMenu();

    private final ContextMenu menuForAnyUser = new ContextMenu();

    public EditableItem() {

        MenuItem addNewDepartment = new MenuItem("department");
        MenuItem deleteAllDepartments = new MenuItem("Delete all departments");

        MenuItem addNewMale = new MenuItem("Add a male employee");
        MenuItem addNewFemale = new MenuItem("Add a female employee");
        MenuItem deleteAllEmployees = new MenuItem("Delete all employees");
        MenuItem deleteDepartments = new MenuItem("Delete employee");

        MenuItem deleteUser = new MenuItem("Delete User");

        menuForRootItem.getItems().addAll(addNewDepartment, deleteAllDepartments);

        menuForAnyDepartment.getItems().addAll(addNewMale, addNewFemale, deleteAllEmployees, deleteDepartments);

        menuForAnyUser.getItems().addAll(deleteUser);

        addNewDepartment.setOnAction((ActionEvent e) -> {

            TreeItem newDepartment = new TreeItem("New Department", getDepartmentIcon());
            getTreeItem().getChildren().add(newDepartment);
            newDepartment.setExpanded(true);

        });

        deleteAllDepartments.setOnAction((ActionEvent e) -> {

            getTreeItem().getChildren().remove(0, getTreeItem().getChildren().size());

        });

        addNewMale.setOnAction((ActionEvent e) -> {

            TreeItem newMale = new TreeItem("New Employee", getUserMaleIcon());
            getTreeItem().getChildren().add(newMale);

        });

        addNewFemale.setOnAction((ActionEvent e) -> {

            TreeItem newFemale = new TreeItem("New Employee", getUserFemaleIcon());
            getTreeItem().getChildren().add(newFemale);

        });

        deleteAllEmployees.setOnAction((ActionEvent e) -> {

            getTreeItem().getChildren().remove(0, getTreeItem().getChildren().size());

        });

        deleteDepartments.setOnAction((ActionEvent e) -> {

            getTreeItem().getParent().getChildren().remove(getTreeItem());

        });

        deleteUser.setOnAction((ActionEvent e) -> {

            getTreeItem().getParent().getChildren().remove(getTreeItem());

        });

    }

    private String getString() {
        return getItem() == null ? "" : getItem();
    }

    private void createTextField() {

        textField = new TextField(getString());

        textField.setOnKeyReleased((KeyEvent t) -> {

            if (t.getCode() == KeyCode.ENTER) {
                commitEdit(textField.getText());
            } else if (t.getCode() == KeyCode.ESCAPE) {
                cancelEdit();
            }

        });

    }

    @Override
    public void startEdit() {
        super.startEdit();
        if (textField == null) {
            createTextField();
        }
        setText(null);
        setGraphic(textField);
        textField.selectAll();
    }

    @Override
    public void cancelEdit() {
        super.cancelEdit();
        setText((String) getString());
        setGraphic(getTreeItem().getGraphic());
    }

    @Override
    protected void updateItem(String item, boolean empty) {
        super.updateItem(item, empty); 
        if (empty) {
            setText(null);
            setGraphic(null);
        } else {
            if (isEditing()) {
                if (textField != null) {
                    textField.setText(getString());
                }
                setText(null);
                setGraphic(textField);
            } else {
                setText(getString());
                setGraphic(getTreeItem().getGraphic());
                
                if (getTreeItem().getParent() == null) {
                    setContextMenu(menuForRootItem);
                } else if (getTreeItem().getParent().getParent() == null) {
                    setContextMenu(menuForAnyDepartment);
                }else if (getTreeItem().getParent().getParent().getParent() == null) {
                    setContextMenu(menuForAnyUser);
                }
            }
        }
    }

}
