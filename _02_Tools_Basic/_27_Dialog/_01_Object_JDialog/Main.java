package _02_Tools_Basic._27_Dialog._01_Object_JDialog;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Dialog Demo");

        Button button = new Button("Open Dialog");

        Dialog dialog = new Dialog();
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.setWidth(200);
        dialog.setHeight(250);

        button.setOnAction(e -> {
            dialog.show();
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 400, 200);
        window.setScene(scene);
        window.show();
    }

}
