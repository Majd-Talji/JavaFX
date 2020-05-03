package _02_Tools_Basic._29_SplitPane._03_Set_Items_in_SplitPane;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {
        SplitPane splitPane = new SplitPane();

        ObservableList listValues = FXCollections.observableArrayList();
        ListView list = new ListView(listValues);
        list.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        try {

            URL urlFolder = Main.class.getResource("images");
            File rootFile = new File(urlFolder.getPath());
            String[] paths = rootFile.list();
            for (String path : paths) {
                listValues.add(path);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Image found!", "Error", JOptionPane.ERROR_MESSAGE);
        }

        Label picture = new Label();
        picture.setAlignment(Pos.CENTER);

        VBox leftControl = new VBox(list);
        leftControl.setMaxHeight(Double.MAX_VALUE);
        VBox.setVgrow(list, Priority.ALWAYS);
        StackPane rightControl = new StackPane(picture);

        splitPane.getItems().addAll(leftControl, rightControl);
        splitPane.setDividerPosition(0, 0.3);

        Scene scene = new Scene(splitPane, 500, 320);
        stage.setTitle("JavaFX SplitPane");
        stage.setScene(scene);
        stage.show();

        list.getSelectionModel().selectedItemProperty().addListener((ov, oldValue, newValue) -> {
            picture.setGraphic(new ImageView(new Image(Main.class.getResourceAsStream("images/" + list.getSelectionModel().getSelectedItem().toString()))));
        });
        list.getSelectionModel().select(0);

    }

    public static void main(String[] args) {
        launch(args);
    }

}
