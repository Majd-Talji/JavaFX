package _05_Events._04_MouseEvent;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("MouseEvent");
        Label mousePosition = new Label("Mouse Position");
        Label mouseStatus = new Label("Mouse Status");

        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(50);
        layout.getChildren().add(mousePosition);
        layout.getChildren().add(mouseStatus);

        layout.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                mousePosition.setText("Mouse Position: (" + e.getX() + ", " + e.getY() + ")");
                mouseStatus.setText("Mouse Status: Mouse Clicked");
            }
        });

        layout.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                mouseStatus.setText("Mouse Status: Mouse Pressed");
            }
        });

        layout.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                mouseStatus.setText("Mouse Status: Mouse Released");
            }
        });

        layout.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                mouseStatus.setText("Mouse Status: Mouse Entered");
            }
        });

        layout.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                mouseStatus.setText("Mouse Status: Mouse Exited");
            }
        });

        Scene scene = new Scene(layout, 400, 250);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
