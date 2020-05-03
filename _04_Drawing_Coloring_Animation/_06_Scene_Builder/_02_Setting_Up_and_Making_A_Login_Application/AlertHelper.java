
package _04_Drawing_Coloring_Animation._06_Scene_Builder._02_Setting_Up_and_Making_A_Login_Application;

import javafx.scene.control.Alert;
import javafx.stage.Window;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class AlertHelper {
    
    public static void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }
    
}
