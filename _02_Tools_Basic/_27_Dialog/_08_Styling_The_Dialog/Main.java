package _02_Tools_Basic._27_Dialog._08_Styling_The_Dialog;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Dialog Demo");

        Button button1 = new Button("Custom Icon");
        Button button2 = new Button("Minimal Decorations");
        Button button3 = new Button("Setting the Modality");

        button1.setOnAction(e -> {
            Dialog dialog = new Dialog();
            dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);

            Stage stage = (Stage) dialog.getDialogPane().getScene().getWindow();
            stage.getIcons().add(new Image(this.getClass().getResource("login-icon64.png").toString()));

            dialog.setTitle("Dialog with Custom Icon");

            dialog.showAndWait();
        });

        button2.setOnAction(e -> {
            Dialog dialog = new Dialog();
            dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);

            Stage stage = (Stage) dialog.getDialogPane().getScene().getWindow();
            stage.getIcons().add(new Image(this.getClass().getResource("login-icon64.png").toString()));

            dialog.setTitle("Dialog with Minimal Decorations");
            dialog.initStyle(StageStyle.UTILITY);
            dialog.showAndWait();
        });

        button3.setOnAction(e -> {
            Dialog dialog = new Dialog();
            dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);

            Stage stage = (Stage) dialog.getDialogPane().getScene().getWindow();
            stage.getIcons().add(new Image(this.getClass().getResource("login-icon64.png").toString()));

            dialog.setTitle("Dialog with Setting the Modality");
            dialog.initModality(Modality.NONE);
            dialog.showAndWait();
        });

        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(10);
        layout.getChildren().addAll(button1, button2, button3);
        Scene scene = new Scene(layout, 400, 200);
        window.setScene(scene);
        window.show();
    }

}
