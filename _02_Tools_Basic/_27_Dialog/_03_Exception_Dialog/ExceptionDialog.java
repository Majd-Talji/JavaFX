package _02_Tools_Basic._27_Dialog._03_Exception_Dialog;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class ExceptionDialog {

    public ExceptionDialog() {

        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Exception Dialog");
        alert.setHeaderText("Look, an Excetion Dialog");
        alert.setContentText("Could not find file MajdTalji.txt");

        Exception ex = new FileNotFoundException("Could not find file MajdTalji.txt");

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        ex.printStackTrace(pw);
        String exceptionText = sw.toString();

        Label label = new Label("The exception stacktrace was: ");

        TextArea textArea = new TextArea(exceptionText);
        textArea.setEditable(false);
        textArea.setWrapText(true);

        textArea.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        GridPane.setVgrow(textArea, Priority.ALWAYS);
        GridPane.setHgrow(textArea, Priority.ALWAYS);

        GridPane exceptionGridPane = new GridPane();
        exceptionGridPane.setMaxWidth(Double.MAX_VALUE);
        exceptionGridPane.add(label, 0, 0);
        exceptionGridPane.add(textArea, 0, 1);

        alert.getDialogPane().setExpandableContent(exceptionGridPane);

        alert.showAndWait();

    }

}
