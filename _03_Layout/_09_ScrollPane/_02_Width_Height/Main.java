package _03_Layout._09_ScrollPane._02_Width_Height;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        ScrollPane root = new ScrollPane();

        StackPane stackPane = new StackPane();

        Button button = new Button("Button");

        button.setPrefSize(300, 200);

        stackPane.minWidthProperty().bind(Bindings.createDoubleBinding(()
                -> root.getViewportBounds().getWidth(), root.viewportBoundsProperty()));

        stackPane.minHeightProperty().bind(Bindings.createDoubleBinding(()
                -> root.getViewportBounds().getHeight(), root.viewportBoundsProperty()));

        stackPane.getChildren().add(button);

        root.setContent(stackPane);

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("JavaFX ScrollPane");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
