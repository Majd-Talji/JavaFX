package _02_Tools_Basic._22_FileChooser._03_Open_File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        FileChooser fileChooser = new FileChooser();
        Button button = new Button("Open File");
        TextArea textArea = new TextArea();

        fileChooser.setTitle("Open Resource File");
        fileChooser.setInitialDirectory(new File("C:\\MyFiles"));

        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text Files", "*.txt"),
                new FileChooser.ExtensionFilter("Java Files", "*.java"),
                new FileChooser.ExtensionFilter("Web Files", "*.html", "*.css", "*.js", "*.php"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );

        button.setTranslateX(20);
        button.setTranslateY(20);
        textArea.setTranslateX(20);
        textArea.setTranslateY(60);

        button.setPrefSize(100, 30);
        textArea.setPrefSize(710, 420);

        Group root = new Group();

        root.getChildren().add(button);
        root.getChildren().add(textArea);

        Scene scene = new Scene(root, 750, 500);

        stage.setTitle("JavaFX FileChooser");

        stage.setScene(scene);

        stage.show();

        button.setOnAction((ActionEvent event) -> {

            File selectedFile = fileChooser.showOpenDialog(stage);

            if (selectedFile != null) {

                String filePath = selectedFile.getPath();
                try {
                    BufferedReader br = new BufferedReader(new FileReader(filePath));
                    String line = "";
                    String text = "";
                    while ((line = br.readLine()) != null) {
                        text += line + "\n";
                    }
                    textArea.setText(text);
                    br.close();
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
