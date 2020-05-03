package _02_Tools_Basic._27_Dialog._04_Confirmation_Dialog_With_Custom_Actions;

import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class ConfirmationDialogWithCustomActions {

    public ConfirmationDialogWithCustomActions() {

        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Dialog With Custom Actions");
        alert.setHeaderText("Look, a Confirmation Dialog With Custom Actions");
        alert.setContentText("Choose your option.");

        ButtonType buttonTypeOne = new ButtonType("One");
        ButtonType buttonTypeTwo = new ButtonType("Two");
        ButtonType buttonTypeThree = new ButtonType("Three");
        ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);

        alert.getButtonTypes().clear();
        alert.getButtonTypes().addAll(buttonTypeOne, buttonTypeTwo, buttonTypeThree, buttonTypeCancel);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == buttonTypeOne) {
            System.out.println("buttonTypeOne");
        } else if (result.get() == buttonTypeTwo) {
            System.out.println("buttonTypeTwo");
        } else if (result.get() == buttonTypeThree) {
            System.out.println("buttonTypeThree");
        } else if (result.get() == buttonTypeCancel) {
            System.out.println("buttonTypeCancel");
        }

    }

}
