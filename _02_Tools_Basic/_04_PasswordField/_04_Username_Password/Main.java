package _02_Tools_Basic._04_PasswordField._04_Username_Password;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Label name = new Label("Name");
        TextField name_data = new TextField();

        Label pass = new Label("Password");
        PasswordField pass_data = new PasswordField();

        Button display_info = new Button("Display user info");
        Label user_info = new Label();

        name.setTranslateX(40);
        name.setTranslateY(40);
        name.setPrefSize(150, 30);

        name_data.setTranslateX(150);
        name_data.setTranslateY(40);
        name_data.setPrefSize(150, 30);

        pass.setTranslateX(40);
        pass.setTranslateY(100);
        pass.setPrefSize(100, 30);

        pass_data.setTranslateX(150);
        pass_data.setTranslateY(100);
        pass_data.setPrefSize(150, 30);

        display_info.setTranslateX(150);
        display_info.setTranslateY(160);
        display_info.setPrefSize(150, 30);

        user_info.setTranslateX(150);
        user_info.setTranslateY(220);
        user_info.setPrefSize(300, 30);

        Group root = new Group();

        root.getChildren().add(name);
        root.getChildren().add(name_data);
        root.getChildren().add(pass);
        root.getChildren().add(pass_data);
        root.getChildren().add(display_info);
        root.getChildren().add(user_info);

        Scene scene = new Scene(root, 460, 340);

        stage.setTitle("JavaFX PasswordField");

        stage.setScene(scene);

        stage.show();

        display_info.setOnAction((t) -> {

            String nameUser = name_data.getText();

            String password = pass_data.getText();

            user_info.setText("Name: " + nameUser + "   \t Password: " + password);

        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
