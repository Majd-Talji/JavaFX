package _02_Tools_Basic._30_ImageView._02_Node_snapshot_ImageIO_SwingFXUtils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.imageio.ImageIO;

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
 
        Circle c = new Circle(100);
        c.setFill(new ImagePattern(image));

        Image withRoundedCorners = c.snapshot(null, null);

        ImageView imageView = new ImageView(withRoundedCorners);

        BufferedImage bufferedImage = SwingFXUtils.fromFXImage(withRoundedCorners, null);
        ImageIO.write(bufferedImage, "png", new File("newImage.png"));
//        stage.getScene().snapshot(null);
        Group layout = new Group(imageView);
        Scene scene = new Scene(layout, 200, 200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
