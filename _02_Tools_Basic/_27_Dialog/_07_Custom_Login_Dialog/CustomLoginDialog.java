package _02_Tools_Basic._27_Dialog._07_Custom_Login_Dialog;

import java.util.Optional;
import java.util.function.Consumer;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.util.Pair;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class CustomLoginDialog {

    public CustomLoginDialog() {
        Dialog<Pair<String, String>> dialog = new Dialog<>();
        dialog.setTitle("Login Dialog");
        dialog.setHeaderText("Look, a Custom Login Dialog");

        dialog.setGraphic(new ImageView(this.getClass().getResource("login-icon64.png").toString()));

        ButtonType loginButtonType = new ButtonType("Login", ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);

        TextField username = new TextField();
        username.setPromptText("Username");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));

        grid.add(new Label("Username"), 0, 0);
        grid.add(username, 1, 0);
        grid.add(new Label("Password"), 0, 1);
        grid.add(passwordField, 1, 1);

        Node loginButton = dialog.getDialogPane().lookupButton(loginButtonType);
        loginButton.setDisable(true);

        username.textProperty().addListener((observable, oldValue, newValue) -> {
            if (username.getText().equals("")) {
                loginButton.setDisable(true);
            } else {
                loginButton.setDisable(false);
            }
        });

        dialog.getDialogPane().setContent(grid);

        Platform.runLater(() -> {
            username.requestFocus();
        });

        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == loginButtonType) {
                return new Pair(username.getText(), passwordField.getText());
            }
            return null;
        });

        Optional<Pair<String, String>> result = dialog.showAndWait();
        if (result.isPresent()) {
            System.out.println("Username: " + result.get().getKey() + "  Password: " + result.get().getValue());
        }

        result.ifPresent(new Consumer<Pair<String, String>>() {
            @Override
            public void accept(Pair<String, String> t) {
                System.out.println("Username: " + t.getKey() + "  Password: " + t.getValue());
            }
        });

    }

}
