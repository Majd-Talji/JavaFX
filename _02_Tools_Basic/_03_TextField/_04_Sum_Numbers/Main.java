package _02_Tools_Basic._03_TextField._04_Sum_Numbers;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label label_1 = new Label("First Number");
        Label label_2 = new Label("Second Number");
        TextField textField_1 = new TextField();
        TextField textField_2 = new TextField();
        Button equalButton = new Button("Calculate the sum");
        Label resultLabel = new Label();

        label_1.setTranslateX(100);
        label_1.setTranslateY(50);
        textField_1.setTranslateX(200);
        textField_1.setTranslateY(47);
        label_2.setTranslateX(100);
        label_2.setTranslateY(90);
        textField_2.setTranslateX(200);
        textField_2.setTranslateY(87);
        equalButton.setTranslateX(100);
        equalButton.setTranslateY(130);
        resultLabel.setTranslateX(100);
        resultLabel.setTranslateY(180);

        label_1.setPrefWidth(90);
        textField_1.setPrefWidth(100);
        label_2.setPrefWidth(90);
        textField_2.setPrefWidth(100);
        equalButton.setPrefSize(200, 30);
        resultLabel.setPrefWidth(200);

        resultLabel.setAlignment(Pos.CENTER);

        Group root = new Group();

        root.getChildren().add(label_1);
        root.getChildren().add(label_2);
        root.getChildren().add(textField_1);
        root.getChildren().add(textField_2);
        root.getChildren().add(equalButton);
        root.getChildren().add(resultLabel);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX TextField");

        stage.setScene(scene);

        stage.show();

        equalButton.setOnAction((ActionEvent e) -> {

            if (textField_1.getText().equals("") && textField_2.getText().equals("")) {
                resultLabel.setText("");
            } else {
                try {
                    double num_1 = Double.valueOf(textField_1.getText());
                    double num_2 = Double.valueOf(textField_2.getText());

                    resultLabel.setTextFill(Color.BLACK);
                    resultLabel.setText(num_1 + " + " + num_2 + " = " + (num_1 + num_2));
                } catch (Exception ex) {
                    resultLabel.setTextFill(Color.RED);
                    resultLabel.setText("Error in Input");
                }
            }

        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
