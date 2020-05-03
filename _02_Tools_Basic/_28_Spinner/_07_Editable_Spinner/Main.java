package _02_Tools_Basic._28_Spinner._07_Editable_Spinner;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Select Level: ");
        Spinner<Integer> spinner = new Spinner<Integer>();
        
        spinner.setEditable(true);
        
        ObservableList<Integer> items = FXCollections.observableArrayList(1,2,3);
        
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.ListSpinnerValueFactory(items);

        MyConverter converter = new MyConverter();
        valueFactory.setConverter(converter);
        
        spinner.setValueFactory(valueFactory);
        
        valueFactory.setValue(2);
        
        spinner.getEditor().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                String text = spinner.getEditor().getText();
                SpinnerValueFactory.ListSpinnerValueFactory<Integer> valueFactory = (SpinnerValueFactory.ListSpinnerValueFactory<Integer>) spinner.getValueFactory();
                
                StringConverter<Integer> converter = valueFactory.getConverter();
                Integer enterValue = converter.fromString(text);
                
                if (!valueFactory.getItems().contains(enterValue)) {
                    valueFactory.getItems().add(enterValue);
                } else {
                    valueFactory.setValue(enterValue);
                }
                
            }
        });

        FlowPane root = new FlowPane();
        root.setHgap(15);
        root.setVgap(15);
        root.setPadding(new Insets(10));

        root.getChildren().add(label);
        root.getChildren().add(spinner);

        Scene scene = new Scene(root, 420, 200);

        stage.setTitle("JavaFX Spinner");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
