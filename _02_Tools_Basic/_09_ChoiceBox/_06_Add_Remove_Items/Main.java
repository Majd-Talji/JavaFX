package _02_Tools_Basic._09_ChoiceBox._06_Add_Remove_Items;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        TextField textField = new TextField();
        ChoiceBox choiceBox = new ChoiceBox();
        Button addButton = new Button("Add Item");
        Button removeButton = new Button("Remove Selected Item");
        Button removeAllButton = new Button("Remove All Item");
        Label counterLabel = new Label("Total items = 0");

        textField.setPrefSize(100, 30);
        addButton.setPrefSize(100, 30);
        removeButton.setPrefSize(220, 30);
        removeAllButton.setPrefSize(220, 30);
        choiceBox.setPrefSize(120, 30);
        counterLabel.setPrefSize(120, 30);

        textField.setTranslateX(20);
        textField.setTranslateY(60);
        addButton.setTranslateX(140);
        addButton.setTranslateY(60);
        removeButton.setTranslateX(20);
        removeButton.setTranslateY(110);
        removeAllButton.setTranslateX(20);
        removeAllButton.setTranslateY(160);
        choiceBox.setTranslateX(260);
        choiceBox.setTranslateY(60);
        counterLabel.setTranslateX(260);
        counterLabel.setTranslateY(110);

        Group root = new Group();

        root.getChildren().add(textField);
        root.getChildren().add(choiceBox);
        root.getChildren().add(addButton);
        root.getChildren().add(removeButton);
        root.getChildren().add(removeAllButton);
        root.getChildren().add(counterLabel);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX ChoiceBox");

        stage.setScene(scene);

        stage.show();
        
        addButton.setOnAction((ActionEvent e) -> {
            if (!textField.getText().equals("")) {
                
                choiceBox.getItems().add(textField.getText());
                
                choiceBox.getSelectionModel().selectLast();
                
                counterLabel.setText("Total Items: " + choiceBox.getItems().size());
                
            }
        });
        
        removeButton.setOnAction((ActionEvent e) -> {
            
            if (!choiceBox.getSelectionModel().isEmpty()) {
                
                choiceBox.getItems().remove(choiceBox.getSelectionModel().getSelectedIndex());
                
                counterLabel.setText("Total Items: " + choiceBox.getItems().size());
                
            }
            
        });
        
        removeAllButton.setOnAction((ActionEvent e) -> {
                
                choiceBox.getItems().clear();
                
                counterLabel.setText("Total Items: " + choiceBox.getItems().size());
                
        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
