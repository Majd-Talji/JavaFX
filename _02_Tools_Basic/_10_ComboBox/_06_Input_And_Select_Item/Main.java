package _02_Tools_Basic._10_ComboBox._06_Input_And_Select_Item;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label labelMail = new Label("Email");
        ComboBox mail = new ComboBox();
        Label labelPass = new Label("Password");
        PasswordField pass = new PasswordField();
        Button loginBtn = new Button("Login");

        mail.setEditable(true);

        mail.getItems().addAll(
                "a123456@gmail.com",
                "b123456@gmail.com",
                "c123456@gmail.com"
        );

        Font newFont = new Font("Tahoma", 20);

        labelMail.setFont(newFont);
        labelPass.setFont(newFont);
        loginBtn.setFont(new Font("Tahoma", 16));

        labelMail.setPrefSize(110, 30);
        mail.setPrefSize(160, 30);
        labelPass.setPrefSize(110, 30);
        pass.setPrefSize(160, 30);
        loginBtn.setPrefSize(160, 30);

        labelMail.setTranslateX(50);
        labelMail.setTranslateY(60);
        mail.setTranslateX(160);
        mail.setTranslateY(60);
        labelPass.setTranslateX(50);
        labelPass.setTranslateY(110);
        pass.setTranslateX(160);
        pass.setTranslateY(110);
        loginBtn.setTranslateX(160);
        loginBtn.setTranslateY(160);

        Group root = new Group();

        root.getChildren().add(labelMail);
        root.getChildren().add(mail);
        root.getChildren().add(labelPass);
        root.getChildren().add(pass);
        root.getChildren().add(loginBtn);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX ComboBox");

        stage.setScene(scene);

        stage.show();

        loginBtn.setOnAction((ActionEvent e) -> {

            String userData = "Mail: " + mail.getValue() + "\n"
                    + "Password: " + pass.getText();
            
            new Alert(Alert.AlertType.INFORMATION, userData).showAndWait();

        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
