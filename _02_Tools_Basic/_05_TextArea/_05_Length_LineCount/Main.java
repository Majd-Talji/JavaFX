package _02_Tools_Basic._05_TextArea._05_Length_LineCount;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        TextArea textArea = new TextArea();
        Label rowsLabel = new Label("Rows: 0");
        Label charsLabel = new Label("Characters: 0");

        textArea.setTranslateX(20);
        textArea.setTranslateY(25);
        rowsLabel.setTranslateX(300);
        rowsLabel.setTranslateY(25);        
        charsLabel.setTranslateX(300);
        charsLabel.setTranslateY(50);

        textArea.setPrefSize(260, 200);

        Group root = new Group();

        root.getChildren().add(textArea);
        root.getChildren().add(rowsLabel);
        root.getChildren().add(charsLabel);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX TextArea");

        stage.setScene(scene);

        stage.show();

        textArea.setOnKeyReleased((KeyEvent e) -> {
            
            charsLabel.setText("Characters: " + textArea.getText().length());
            
            if (textArea.getText().equals("")) {
                rowsLabel.setText("Rows: 0");
            } else {
                rowsLabel.setText("Rows: " + textArea.getText().split("\n").length);
            }
            
        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
