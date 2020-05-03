package _02_Tools_Basic._22_FileChooser._01_Object_File_Chooser_Dialog;

import java.io.File;
import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        FileChooser fileChooser = new FileChooser();
        
        fileChooser.setTitle("Open Resource File");
        
        File selectedFile = fileChooser.showOpenDialog(stage);
        
        if (selectedFile != null) {
            JOptionPane.showMessageDialog(null, "File is: " + selectedFile.getPath());
        }
        
        System.exit(0);

    }

    public static void main(String[] args) {
        launch(args);
    }

}
