package _02_Tools_Basic._12_TableView._02_TableColumn_In_TableColumn;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        TableView table = new TableView();

        TableColumn columnFirstName = new TableColumn("First Name");
        TableColumn columnLastName = new TableColumn("Last Name");
        TableColumn columnEmail = new TableColumn("Email");

        TableColumn columnEmailPrimary = new TableColumn("Primary");
        TableColumn columnEmailSecondary = new TableColumn("Secondary");

        table.getColumns().addAll(columnFirstName, columnLastName, columnEmail);

        columnEmail.getColumns().addAll(columnEmailPrimary, columnEmailSecondary);

        table.setPlaceholder(new Label("Table is empty"));

        table.setPrefSize(440, 300);

        columnFirstName.setPrefWidth(100);
        columnLastName.setPrefWidth(100);
        columnEmailPrimary.setPrefWidth(120);
        columnEmailSecondary.setPrefWidth(120);

        table.setTranslateX(10);
        table.setTranslateY(10);

        Group root = new Group();

        root.getChildren().add(table);

        Scene scene = new Scene(root, 460, 320);

        stage.setTitle("JavaFX TableView");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
