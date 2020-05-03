package _01_Basis._13_Properties;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    Stage window;
    Button button;
    TextField textField;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("The New Properties");

        button = new Button("Submit");
        textField = new TextField("Majd Talji");
        StackPane.setAlignment(textField, Pos.TOP_CENTER);
        StackPane.setAlignment(button, Pos.BOTTOM_CENTER);
        
        Person person = new Person();
        
        person.firstNameProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            System.out.println("Name Change to " + newValue);
            System.out.println("firstNameProperty(): " + person.firstNameProperty());
            System.out.println("getFirstName(): " + person.getFirstName());
        });
        
        button.setOnAction((ActionEvent event) -> {
            person.setFirstName(textField.getText());
        });
        
        StackPane layout = new StackPane();
        layout.getChildren().addAll(textField, button);
        layout.setPadding(new Insets(5));
        Scene scene = new Scene(layout, 300, 100);
        window.setScene(scene);
        window.show();
    }

}
