package _02_Tools_Basic._18_Hyperlink_Webview._02_Style_Hyperlink;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Hyperlink hyperlink = new Hyperlink("Google.com");

        Background defaultBackground = new Background(new BackgroundFill(Color.CADETBLUE, new CornerRadii(5), Insets.EMPTY));

        Background hoveredBackground = new Background(new BackgroundFill(Color.DARKCYAN, new CornerRadii(5), Insets.EMPTY));

        hyperlink.setTranslateX(125);
        hyperlink.setTranslateY(108);

        hyperlink.setPrefSize(150, 34);

        hyperlink.setBorder(Border.EMPTY);

        hyperlink.setUnderline(false);

        hyperlink.setFont(new Font("Arial", 15));

        hyperlink.setTextFill(Color.WHITE);

        hyperlink.setAlignment(Pos.CENTER);
        
        hyperlink.setBackground(defaultBackground);

        Group root = new Group();

        root.getChildren().add(hyperlink);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX Hyperlink");

        stage.setScene(scene);

        stage.show();
        
        hyperlink.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
            
            hyperlink.setBackground(hoveredBackground);
            
        });
        
        hyperlink.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
            
            hyperlink.setBackground(defaultBackground);
            
        });

        
        hyperlink.setOnAction((event) -> {
            try {
                Desktop.getDesktop().browse(new URI("https://google.com"));
            } catch (IOException | URISyntaxException e) {
                System.out.println(e.getMessage());
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }

}
