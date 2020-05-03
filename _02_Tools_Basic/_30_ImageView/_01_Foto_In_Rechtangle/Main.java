package _02_Tools_Basic._30_ImageView._01_Foto_In_Rechtangle;

import java.io.File;
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        File file = new File("C:\\MyFiles\\Neuer Ordner\\login\\Webp.net-resizeimage.jpg");
        FileInputStream inputStream = new FileInputStream(file);
        Image image = new Image(inputStream);

        Rectangle r = new Rectangle(image.getWidth(), image.getHeight());
        r.setArcHeight(50);
        r.setArcWidth(50);
        r.setFill(new ImagePattern(image));

        Image withRoundedCorners = r.snapshot(null, null);

        ImageView imageView = new ImageView(withRoundedCorners);

        imageView.fitWidthProperty().bind(stage.widthProperty().subtract(16));
        imageView.fitHeightProperty().bind(stage.heightProperty().subtract(39));

        Group layout = new Group(imageView);
        Scene scene = new Scene(layout, 428, 375);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
