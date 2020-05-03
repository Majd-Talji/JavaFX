package _03_Layout._11_TitledPane_Accordion._02_TitledPanes_In_Accordion;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        FlowPane root = new FlowPane();

        root.setAlignment(Pos.TOP_CENTER);

        TitledPane titledPane1 = new TitledPane("Titled Pane 1", new Button("Button 1"));
        TitledPane titledPane2 = new TitledPane("Titled Pane 2", new Button("Button 2"));
        TitledPane titledPane3 = new TitledPane("Titled Pane 3", new Button("Button 3"));

        Accordion accordion = new Accordion(titledPane1, titledPane2, titledPane3);

        accordion.setPrefWidth(200);

        root.getChildren().add(accordion);

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("JavaFX TitledPane & Accordion");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
