package _02_Tools_Basic._26_Alert._02_Button_Clicked;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Button button1 = new Button("Delete your history");
        Button button2 = new Button("Exit");
        Label label = new Label();

        label.setStyle("-fx-font-size: 15px;"
                + "-fx-font-weight: bold;"
                + "-fx-alignment: center;");

        button1.setPrefSize(200, 30);
        button2.setPrefSize(200, 30);
        label.setPrefSize(200, 30);

        button1.setTranslateX(100);
        button1.setTranslateY(75);
        button2.setTranslateX(100);
        button2.setTranslateY(115);
        label.setTranslateX(100);
        label.setTranslateY(175);

        Group root = new Group();

        root.getChildren().add(button1);
        root.getChildren().add(button2);
        root.getChildren().add(label);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX  Alert");

        stage.setScene(scene);

        stage.show();

        button1.setOnAction((ActionEvent e) -> {
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Delete History");
            alert.setHeaderText("Delete History");
            alert.setContentText("You are going to delete you history.\nAre you sure?");

            alert.showAndWait().ifPresent(response -> {

                if (response == ButtonType.OK) {
                    label.setTextFill(Color.BLUE);
                } else {
                    label.setTextFill(Color.RED);
                }

            });

            label.setText(alert.getResult().getText());
        });

        button2.setOnAction((ActionEvent e) -> {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText("Warning");
            alert.setContentText("Save change before closing?");

            alert.getButtonTypes().add(ButtonType.NO);
            alert.getButtonTypes().add(ButtonType.CANCEL);

            alert.showAndWait().ifPresent(response -> {

                if (response == ButtonType.OK) {

                    System.exit(0);

                } else if (response == ButtonType.NO) {

                    label.setTextFill(Color.RED);

                } else if (response == ButtonType.CANCEL) {

                    label.setTextFill(Color.BROWN);

                }

            });

            label.setText(alert.getResult().getText());
        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
