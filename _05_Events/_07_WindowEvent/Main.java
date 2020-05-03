package _05_Events._07_WindowEvent;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Sample Application");
        Text text = new Text("Welcome to Majd Talji");
        text.setFont(new Font(35));

        StackPane layout = new StackPane();
        layout.getChildren().add(text);

        Scene scene = new Scene(layout, 400, 250);
        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                JOptionPane.showMessageDialog(null, "Event: window Close");
            }
        });

        stage.setOnHiding(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                JOptionPane.showMessageDialog(null, "Hiding Event: window Hiding");
            }
        });

        stage.setOnHidden(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                JOptionPane.showMessageDialog(null, "Event: window Hidden");
            }
        });

        stage.setOnShowing(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                JOptionPane.showMessageDialog(null, "Event: window Showing");
            }
        });

        stage.setOnShown(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                JOptionPane.showMessageDialog(null, "Event: window Shown");
            }
        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
