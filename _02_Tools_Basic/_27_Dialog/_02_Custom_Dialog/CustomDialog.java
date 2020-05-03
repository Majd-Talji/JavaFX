package _02_Tools_Basic._27_Dialog._02_Custom_Dialog;

import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class CustomDialog {

    private Dialog dialog;

    public CustomDialog() {

        dialog = new Dialog();
        dialog.setHeaderText("This is a custom dialog");
        ButtonType closeButtton = new ButtonType("Close", ButtonData.CANCEL_CLOSE);
        dialog.getDialogPane().getButtonTypes().add(closeButtton);
        dialog.setTitle("Custom Dialog");

    }

    public void show() {
        dialog.show();
    }

    public void hide() {
        dialog.close();
    }

}
