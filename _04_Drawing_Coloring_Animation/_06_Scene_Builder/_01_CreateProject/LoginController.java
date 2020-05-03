/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _04_Drawing_Coloring_Animation._06_Scene_Builder._01_CreateProject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/**
 * FXML Controller class
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class LoginController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        Alert alertInformation = new Alert(AlertType.INFORMATION);
        alertInformation.setHeaderText("First Alert using FXML");
        alertInformation.setContentText("This is just a test");
        alertInformation.showAndWait();
    }
    
}
