package _02_Tools_Basic._25_MenuBar._02_Object_MenuItem_addSeparator_Events;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        MenuBar menuBar = new MenuBar();

        Menu menuFile = new Menu("File");
        Menu menuEdit = new Menu("Edit");
        Menu menuView = new Menu("View");

        MenuItem itemNewFile = new MenuItem("New");
        MenuItem itemOpen = new MenuItem("Open");
        MenuItem itemSave = new MenuItem("Save");
        MenuItem itemExit = new MenuItem("Exit");
        MenuItem itemUndo = new MenuItem("Undo");
        MenuItem itemCut = new MenuItem("Cut");
        MenuItem itemCopy = new MenuItem("Copy");
        MenuItem itemPaste = new MenuItem("Paste");
        MenuItem itemSelect = new MenuItem("Select All");
        MenuItem itemAbout = new MenuItem("About");
        MenuItem itemReport = new MenuItem("Report Issue");

        menuBar.getMenus().addAll(menuFile, menuEdit, menuView);

        menuFile.getItems().add(itemNewFile);
        menuFile.getItems().add(itemOpen);
        menuFile.getItems().add(itemSave);
        menuFile.getItems().add(new SeparatorMenuItem());
        menuFile.getItems().add(itemExit);

        menuEdit.getItems().add(itemUndo);
        menuEdit.getItems().add(new SeparatorMenuItem());
        menuEdit.getItems().add(itemCut);
        menuEdit.getItems().add(itemCopy);
        menuEdit.getItems().add(itemPaste);
        menuEdit.getItems().add(new SeparatorMenuItem());
        menuEdit.getItems().add(itemSelect);

        menuView.getItems().add(itemAbout);
        menuView.getItems().add(itemReport);

        menuBar.setPrefWidth(400);

        Group root = new Group();

        root.getChildren().add(menuBar);

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("JavaFX MenuBar");

        stage.setScene(scene);

        stage.show();

        EventHandler eventHandler = new EventHandler() {
            @Override
            public void handle(Event e) {
                System.out.println("Alles Gut");
                if (e.getSource() == itemNewFile) {
                    System.out.println("itemNewFile");
                } else if (e.getSource() == itemOpen) {
                    System.out.println("itemOpen");
                } else if (e.getSource() == itemSave) {
                    System.out.println("itemSave");
                } else if (e.getSource() == itemExit) {
                    System.out.println("itemExit");
                    System.exit(0);
                } else if (e.getSource() == itemUndo) {
                    System.out.println("itemUndo");
                } else if (e.getSource() == itemCut) {
                    System.out.println("itemCut");
                } else if (e.getSource() == itemCopy) {
                    System.out.println("itemCopy");
                } else if (e.getSource() == itemPaste) {
                    System.out.println("itemPaste");
                } else if (e.getSource() == itemSelect) {
                    System.out.println("itemSelect");
                } else if (e.getSource() == itemAbout) {
                    System.out.println("itemAbout");
                } else if (e.getSource() == itemReport) {
                    System.out.println("itemReport");
                }
            }
        };

        itemNewFile.addEventHandler(ActionEvent.ACTION, eventHandler);
        itemOpen.addEventHandler(ActionEvent.ACTION, eventHandler);
        itemSave.addEventHandler(ActionEvent.ACTION, eventHandler);
        itemExit.addEventHandler(ActionEvent.ACTION, eventHandler);
        itemUndo.addEventHandler(ActionEvent.ACTION, eventHandler);
        itemCopy.addEventHandler(ActionEvent.ACTION, eventHandler);
        itemCut.addEventHandler(ActionEvent.ACTION, eventHandler);
        itemPaste.addEventHandler(ActionEvent.ACTION, eventHandler);
        itemSelect.addEventHandler(ActionEvent.ACTION, eventHandler);
        itemAbout.addEventHandler(ActionEvent.ACTION, eventHandler);
        itemReport.addEventHandler(ActionEvent.ACTION, eventHandler);

        itemNewFile.setOnAction(eventHandler);

        itemOpen.setOnAction(eventHandler);

        itemSave.setOnAction(eventHandler);

        itemExit.setOnAction(eventHandler);

        itemUndo.setOnAction((ActionEvent event) -> {
            System.out.println("itemUndo");
        });

        itemCopy.setOnAction((ActionEvent event) -> {
            System.out.println("itemCopy");
        });

        itemCut.setOnAction((ActionEvent event) -> {
            System.out.println("itemCut");
        });

        itemPaste.setOnAction((ActionEvent event) -> {
            System.out.println("itemPaste");
        });

        itemSelect.setOnAction((ActionEvent event) -> {
            System.out.println("itemSelect");
        });

        itemAbout.setOnAction((ActionEvent event) -> {
            System.out.println("itemAbout");
        });

        itemReport.setOnAction((ActionEvent event) -> {
            System.out.println("itemReport");
        });
    }

    public static void main(String[] args) {
        launch(args);
    }

}
