package _02_Tools_Basic._26_Alert._01_Type_Alert;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Button button1 = new Button("Display Information Alert");
        Button button2 = new Button("Display Warning Alert");
        Button button3 = new Button("Display Error Alert");
        Button button4 = new Button("Display Confirmation Alert");

        button1.setPrefSize(200, 30);
        button2.setPrefSize(200, 30);
        button3.setPrefSize(200, 30);
        button4.setPrefSize(200, 30);

        button1.setTranslateX(100);
        button1.setTranslateY(55);
        button2.setTranslateX(100);
        button2.setTranslateY(95);
        button3.setTranslateX(100);
        button3.setTranslateY(135);
        button4.setTranslateX(100);
        button4.setTranslateY(175);

        Group root = new Group();

        root.getChildren().add(button1);
        root.getChildren().add(button2);
        root.getChildren().add(button3);
        root.getChildren().add(button4);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX  Alert");

        stage.setScene(scene);

        stage.show();
        
        button1.setOnAction((ActionEvent e) -> {
            Alert alertInformation = new Alert(AlertType.INFORMATION);
            alertInformation.setTitle("Information Alert Title!");
            alertInformation.setHeaderText("Information Alert Header");
            alertInformation.setContentText("Information Alert Content \nWhich can appears on multi-line if needed");
            alertInformation.showAndWait();
        });
        
        button2.setOnAction((ActionEvent e) -> {
            Alert alertWarning = new Alert(AlertType.WARNING);
            alertWarning.setTitle("Warning Alert Title!");
            alertWarning.setHeaderText("Warning Alert Header");
            alertWarning.setContentText("Warning Alert Content \nWhich can appears on multi-line if needed");
            alertWarning.showAndWait();
        });
        
        button3.setOnAction((ActionEvent e) -> {
            Alert alertError = new Alert(AlertType.ERROR);
            alertError.setTitle("Error Alert Title!");
            alertError.setHeaderText("Error Alert Header");
            alertError.setContentText("Error Alert Content \nWhich can appears on multi-line if needed");
            alertError.showAndWait();
        });
        
        button4.setOnAction((ActionEvent e) -> {
            Alert alertConfirmation = new Alert(AlertType.CONFIRMATION);
            alertConfirmation.setTitle("Confirmation Alert Title!");
            alertConfirmation.setHeaderText("Error Alert Header");
            alertConfirmation.setContentText("Error Alert Content \nWhich can appears on multi-line if needed");
            alertConfirmation.showAndWait();
        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
