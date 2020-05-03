package _02_Tools_Basic._27_Dialog._06_Choice_Dialog;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javafx.scene.control.ChoiceDialog;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class ChoicesDialog {

    public ChoicesDialog() {
        List<String> chooices = new ArrayList<>();
        chooices.add("a");
        chooices.add("b");
        chooices.add("c");

        ChoiceDialog<String> dialog = new ChoiceDialog("b", chooices);
        dialog.setTitle("Text Choice Dialog");
        dialog.setHeaderText("Look, a Choice Dialog");
        dialog.setContentText("Choose your letters: ");

        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {
            System.out.println("Your Choice: " + result.get());
        }
        
        result.ifPresent(name -> System.out.println("Your Choice: " + name));

    }

}
