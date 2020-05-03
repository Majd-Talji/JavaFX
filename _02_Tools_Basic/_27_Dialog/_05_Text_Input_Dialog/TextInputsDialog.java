package _02_Tools_Basic._27_Dialog._05_Text_Input_Dialog;

import java.util.Optional;
import javafx.scene.control.TextInputDialog;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class TextInputsDialog {

    public TextInputsDialog() {

        TextInputDialog dialog = new TextInputDialog("Majd Talji");
        dialog.setTitle("Text Input Dialog");
        dialog.setHeaderText("Look, a Text Input Dialog");
        dialog.setContentText("Please enter your name: ");

        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {
            System.out.println("Your name: " + result.get());
        }
        
        result.ifPresent(name -> System.out.println("Your name: " + name));

    }

}
