package _02_Tools_Basic._22_FileChooser._02_Filter_File;

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
        fileChooser.setInitialDirectory(new File("C:\\MyFiles"));
        
        fileChooser.setTitle("Open Resource File");
        
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text Files", "*.txt"),
                new FileChooser.ExtensionFilter("Java Files", "*.java"),
                new FileChooser.ExtensionFilter("Web Files", "*.html", "*.css", "*.js", "*.php"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );
        
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
