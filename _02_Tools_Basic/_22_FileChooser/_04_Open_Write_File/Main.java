package _02_Tools_Basic._22_FileChooser._04_Open_Write_File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
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

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/Y HH:mm:ss");

        FileChooser fileChooser = new FileChooser();
        Button button = new Button("Save Now");
        Label label = new Label();
        TextArea textArea = new TextArea();

        fileChooser.setTitle("Save File");
        fileChooser.setInitialDirectory(new File("C:\\MyFiles"));

        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text Files", "*.txt"),
                new FileChooser.ExtensionFilter("Java Files", "*.java"),
                new FileChooser.ExtensionFilter("Web Files", "*.html", "*.css", "*.js", "*.php"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );

        button.setTranslateX(20);
        button.setTranslateY(20);
        label.setTranslateX(140);
        label.setTranslateY(20);
        textArea.setTranslateX(20);
        textArea.setTranslateY(60);

        button.setPrefSize(100, 30);
        label.setPrefSize(500, 30);
        textArea.setPrefSize(710, 420);

        Group root = new Group();

        root.getChildren().add(button);
        root.getChildren().add(label);
        root.getChildren().add(textArea);

        Scene scene = new Scene(root, 750, 500);

        stage.setTitle("JavaFX FileChooser");

        stage.setScene(scene);

        stage.show();

        button.setOnAction((ActionEvent event) -> {

            File file = fileChooser.showSaveDialog(stage);

            if (file != null) {

                String filePath = file.getPath();
                try {
                    FileOutputStream fos = new FileOutputStream(filePath);
                    OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
                    BufferedWriter bw = new BufferedWriter(osw);

                    bw.write(textArea.getText());
                    bw.flush();
                    bw.close();

                    label.setText(filePath + " -- Saved Successfully [ " + dateFormat.format(new Date()) + " ]");
                } catch (IOException e) {
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("ERROR");
                    alert.setHeaderText("Opps.. There is a problem");
                    alert.setContentText(e.getMessage());
                    alert.show();
                }

            }

        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
