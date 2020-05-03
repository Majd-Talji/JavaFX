package _02_Tools_Basic._12_TableView._06_Add_ChoiceBox_To_Table;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        String[] usersRoles = {"Admin", "Editor", "Author", "Contributor", "Subscriber"};

        Label labelName = new Label("Name");
        Label labelRole = new Label("Role");
        Label labelEmail = new Label("Email");
        Label labelTotalUsers = new Label("To Users: 0");

        Button buttonAdd = new Button("Add Record");
        Button buttonDelete = new Button("Delete");
        Button buttonDeleteAll = new Button("Delete All");

        TextField fieldName = new TextField();
        TextField fieldEmail = new TextField();

        ChoiceBox choiceBoxRole = new ChoiceBox(FXCollections.observableArrayList(usersRoles));

        TableView<User> table = new TableView();

        ObservableList<User> data = FXCollections.observableArrayList();

        TableColumn<User, String> columnName = new TableColumn("Name");
        columnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        columnName.setCellFactory(TextFieldTableCell.forTableColumn());
        columnName.setOnEditCommit((CellEditEvent<User, String> t) -> {
            ((User) t.getTableView()
                    .getItems()
                    .get(t.getTablePosition().getRow()))
                    .setName(t.getNewValue());
        });

        TableColumn<User, String> columnRole = new TableColumn("Role");
        columnRole.setCellValueFactory(new PropertyValueFactory<>("role"));
        columnRole.setCellFactory(User.forTableColumn(usersRoles));
        columnRole.setOnEditCommit((CellEditEvent<User, String> t) -> {
            ((User) t.getTableView()
                    .getItems()
                    .get(t.getTablePosition().getRow()))
                    .setRole(t.getNewValue());
        });

        TableColumn<User, String> columnEmail = new TableColumn("Email");
        columnEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        columnEmail.setCellFactory(TextFieldTableCell.forTableColumn());
        columnEmail.setOnEditCommit((CellEditEvent<User, String> t) -> {
            ((User) t.getTableView()
                    .getItems()
                    .get(t.getTablePosition().getRow()))
                    .setName(t.getNewValue());
        });

        table.setEditable(true);

        table.getColumns().addAll(columnName, columnRole, columnEmail);

        table.setItems(data);

        table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        table.setPrefSize(500, 200);
        columnName.setPrefWidth(120);
        columnRole.setPrefWidth(180);
        columnEmail.setPrefWidth(200);
        labelName.setPrefSize(50, 30);
        labelRole.setPrefSize(50, 30);
        labelEmail.setPrefSize(50, 30);
        fieldName.setPrefSize(180, 30);
        choiceBoxRole.setPrefSize(180, 30);
        fieldEmail.setPrefSize(180, 30);
        buttonAdd.setPrefSize(230, 30);
        labelTotalUsers.setPrefSize(230, 30);
        buttonDelete.setPrefSize(180, 30);
        buttonDeleteAll.setPrefSize(180, 30);

        table.setTranslateX(280);
        table.setTranslateY(25);
        labelName.setTranslateX(20);
        labelName.setTranslateY(45);
        labelRole.setTranslateX(20);
        labelRole.setTranslateY(85);
        labelEmail.setTranslateX(20);
        labelEmail.setTranslateY(125);
        fieldName.setTranslateX(70);
        fieldName.setTranslateY(45);
        choiceBoxRole.setTranslateX(70);
        choiceBoxRole.setTranslateY(85);
        fieldEmail.setTranslateX(70);
        fieldEmail.setTranslateY(125);
        buttonAdd.setTranslateX(20);
        buttonAdd.setTranslateY(175);
        labelTotalUsers.setTranslateX(20);
        labelTotalUsers.setTranslateY(250);
        buttonDelete.setTranslateX(330);
        buttonDelete.setTranslateY(250);
        buttonDeleteAll.setTranslateX(540);
        buttonDeleteAll.setTranslateY(250);

        Group root = new Group();

        root.getChildren().add(labelName);
        root.getChildren().add(labelRole);
        root.getChildren().add(labelEmail);
        root.getChildren().add(labelTotalUsers);
        root.getChildren().add(buttonAdd);
        root.getChildren().add(buttonDelete);
        root.getChildren().add(buttonDeleteAll);
        root.getChildren().add(fieldName);
        root.getChildren().add(choiceBoxRole);
        root.getChildren().add(fieldEmail);
        root.getChildren().add(table);
        
        choiceBoxRole.getSelectionModel().selectFirst();

        Scene scene = new Scene(root, 800, 300);

        stage.setTitle("JavaFX TableView");

        stage.setScene(scene);

        stage.show();

        buttonAdd.setOnAction(Action -> {

            String name = fieldName.getText();
            String role = choiceBoxRole.getSelectionModel().getSelectedItem().toString();
            String email = fieldEmail.getText();

            if (!name.equals("") && !role.equals("") && !email.equals("")) {
                data.add(new User(name, role, email));
                labelTotalUsers.setText("Total Users: " + table.getItems().size());
                fieldName.setText("");
                choiceBoxRole.getSelectionModel().selectFirst();
                fieldEmail.setText("");
            } else {
                new Alert(AlertType.WARNING, "Name, Role and Email fields cannot be empty").show();
            }

        });

        buttonDelete.setOnAction((Action) -> {

            table.getItems().removeAll(table.getSelectionModel().getSelectedItems());

            labelTotalUsers.setText("Total Users: " + table.getItems().size());

        });

        buttonDeleteAll.setOnAction((Action) -> {

            table.getItems().clear();

            labelTotalUsers.setText("Total Users: " + table.getItems().size());

        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
