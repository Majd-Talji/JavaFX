package _02_Tools_Basic._28_Spinner._04_Spinner_Style;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Spinner;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        String[] styleClasses = new String[]{
            "",
            Spinner.STYLE_CLASS_ARROWS_ON_RIGHT_HORIZONTAL,
            Spinner.STYLE_CLASS_ARROWS_ON_LEFT_VERTICAL,
            Spinner.STYLE_CLASS_ARROWS_ON_LEFT_HORIZONTAL,
            Spinner.STYLE_CLASS_SPLIT_ARROWS_VERTICAL,
            Spinner.STYLE_CLASS_SPLIT_ARROWS_HORIZONTAL
        };

        FlowPane root = new FlowPane();
        root.setHgap(15);
        root.setVgap(15);
        root.setPadding(new Insets(10));

        for (String styleClasse : styleClasses) {
            Spinner<Integer> spinner = new Spinner<>(1, 20, 10);
            spinner.getStyleClass().add(styleClasse);
            root.getChildren().add(spinner);
        }

        Scene scene = new Scene(root, 400, 250);
        stage.setTitle("Sample Application");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
