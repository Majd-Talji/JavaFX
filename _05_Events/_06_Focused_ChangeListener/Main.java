package _05_Events._06_Focused_ChangeListener;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Label name = new Label("Name");
        TextField name_data = new TextField();

        Label pass = new Label("Password");
        PasswordField pass_data = new PasswordField();

        name.setTranslateX(40);
        name.setTranslateY(40);
        name.setPrefSize(150, 30);

        name_data.setTranslateX(150);
        name_data.setTranslateY(40);
        name_data.setPrefSize(150, 30);

        pass.setTranslateX(40);
        pass.setTranslateY(100);
        pass.setPrefSize(100, 30);

        pass_data.setTranslateX(150);
        pass_data.setTranslateY(100);
        pass_data.setPrefSize(150, 30);

        Group root = new Group();

        root.getChildren().add(name);
        root.getChildren().add(name_data);
        root.getChildren().add(pass);
        root.getChildren().add(pass_data);

        Scene scene = new Scene(root, 350, 200);

        stage.setTitle("Focused ChangeListener");

        stage.setScene(scene);

        stage.show();
        
        String style = name_data.getStyle();

        name_data.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if (newValue) {
                    name_data.setStyle("-fx-background-color: yellow");
                } else {
                    name_data.setStyle(style);
                }
            }
        });

        pass_data.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if (newValue) {
                    pass_data.setStyle("-fx-background-color: yellow");
                } else {
                    pass_data.setStyle(null);
                }
            }
        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
