package _01_Basis._17_CallBack._02_setCellValueFactory_callBack;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {
        TableView<Person> table = new TableView<Person>();
        table.getItems().add(new Person("Majd", "Talji"));
        table.getItems().add(new Person("Alaa", "Aubshehaude"));

        TableColumn<Person, TextField> firstNameColumn = new TableColumn("Vorname");
        firstNameColumn.setCellValueFactory(new TextFieldValueFactor<Person>(person -> person.nameProperty()));

        TableColumn<Person, TextField> lastNameColumn = new TableColumn("Nachname");
        lastNameColumn.setCellValueFactory(new TextFieldValueFactor<Person>(person -> person.lastNameProperty()));

        table.getColumns().addAll(firstNameColumn, lastNameColumn);

        StackPane layout = new StackPane();
        layout.getChildren().add(table);

        Scene scene = new Scene(layout, 400, 250);
        stage.setTitle("Sample Application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
