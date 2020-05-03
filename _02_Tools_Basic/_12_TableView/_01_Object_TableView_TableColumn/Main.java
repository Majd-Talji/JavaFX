package _02_Tools_Basic._12_TableView._01_Object_TableView_TableColumn;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
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

        table.getColumns().addAll(columnFirstName, columnLastName, columnEmail);

        table.setPrefSize(440, 300);

        columnFirstName.setPrefWidth(120);
        columnLastName.setPrefWidth(120);
        columnEmail.setPrefWidth(200);

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
