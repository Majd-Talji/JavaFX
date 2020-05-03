package _02_Tools_Basic._24_ContextMenu._01_Object_ContextMenu_In_ImageView;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    Pane pane = new Pane();

    Image image = new Image(getClass().getResourceAsStream("javafx-icon.png"));

    ImageView imageView = new ImageView(image);

    ContextMenu contextMenu = new ContextMenu();

    MenuItem menuItem1 = new MenuItem("Rotate Right");
    MenuItem menuItem2 = new MenuItem("Rotate Left");
    CheckMenuItem checkMenuItem = new CheckMenuItem("Show Border");
    RadioMenuItem radioMenuItem1 = new RadioMenuItem("Black Border");
    RadioMenuItem radioMenuItem2 = new RadioMenuItem("Blue Border");

    ToggleGroup toggleGroup = new ToggleGroup();

    public void drawBorderOnDemande() {

        if (checkMenuItem.isSelected()) {

            if (radioMenuItem1.isSelected()) {
                pane.setStyle("-fx-border-style: solid; -fx-border-color: black");
            } else {
                pane.setStyle("-fx-border-style: solid; -fx-border-color: blue");
            }

        } else {
            pane.setStyle("-fx-border-style: none;");
        }

    }

    public void autoEnableOrDisableMenuOptions() {

        if (checkMenuItem.isSelected()) {
            radioMenuItem1.setDisable(false);
            radioMenuItem2.setDisable(false);
        } else {
            radioMenuItem1.setDisable(true);
            radioMenuItem2.setDisable(true);
        }

    }

    @Override
    public void start(Stage stage) {

        pane.setPrefSize(202, 202);
        pane.setTranslateX(99);
        pane.setTranslateY(24);

        pane.getChildren().add(imageView);
//        pane.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));

        imageView.setFitWidth(200);
        imageView.setFitHeight(200);
        imageView.setTranslateX(1);
        imageView.setTranslateY(1);

        radioMenuItem1.setToggleGroup(toggleGroup);
        radioMenuItem2.setToggleGroup(toggleGroup);

        contextMenu.getItems().add(menuItem1);
        contextMenu.getItems().add(menuItem2);
        contextMenu.getItems().add(new SeparatorMenuItem());
        contextMenu.getItems().add(checkMenuItem);
        contextMenu.getItems().add(new SeparatorMenuItem());
        contextMenu.getItems().add(radioMenuItem1);
        contextMenu.getItems().add(radioMenuItem2);

        Group root = new Group();

        root.getChildren().add(pane);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX  ContextMenu");

        stage.setScene(scene);

        stage.show();

        imageView.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {

            if (e.getButton() == MouseButton.SECONDARY) {
                contextMenu.show(imageView, e.getScreenX(), e.getScreenY());
            }

        });

        menuItem1.setOnAction((ActionEvent event) -> {

            imageView.setRotate(imageView.getRotate() + 90);

        });

        menuItem2.setOnAction((ActionEvent event) -> {

            imageView.setRotate(imageView.getRotate() - 90);

        });

        checkMenuItem.setOnAction((ActionEvent event) -> {

            drawBorderOnDemande();
            autoEnableOrDisableMenuOptions();

        });

        toggleGroup.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) -> {
            
            drawBorderOnDemande();

        });

        checkMenuItem.setSelected(false);
        
        radioMenuItem1.setSelected(true);
        
        autoEnableOrDisableMenuOptions();
        
    }

    public static void main(String[] args) {
        launch(args);
    }

}
