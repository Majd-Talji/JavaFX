package _01_Basis._14_Binding._03_unbind_bind_Properties;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        TextField textField1 = new TextField();
        TextField textField2 = new TextField();

        Button button1 = new Button("Bind");
        Button button2 = new Button("Unbind");

        button1.setOnAction((event) -> {
            textField2.textProperty().bind(textField1.textProperty());
        });

        button2.setOnAction((event) -> {
            textField2.textProperty().unbind();
        });

        VBox vBox = new VBox();
        vBox.setPadding(new Insets(10));
        vBox.setSpacing(10);

        vBox.getChildren().addAll(textField1, textField2, button1, button2);

        Scene scene = new Scene(vBox, 500, 150, Color.WHITE);
        stage.setTitle("Bind & Unbind");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
