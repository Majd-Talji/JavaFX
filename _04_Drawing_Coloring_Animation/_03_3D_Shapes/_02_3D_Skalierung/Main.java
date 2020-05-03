package _04_Drawing_Coloring_Animation._03_3D_Shapes._02_3D_Skalierung;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Point3D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Box;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage s) throws Exception {
        FlowPane root = new FlowPane();

        Pane pane = new Pane();
        Box box = new Box(100, 100, 100);
        Sphere sphere = new Sphere(50);
        box.setManaged(false);
        pane.setStyle("-fx-background-color: black;");
        pane.setMinSize(600, 600);
        pane.getChildren().add(box);

        VBox vbox = new VBox();
        vbox.setPadding(new Insets(5));

        VBox vbox1 = new VBox();
        Label translate = new Label("Translate");

        Slider t1 = new Slider();
        t1.setMax(600);
        t1.valueProperty().bindBidirectional(box.translateXProperty());
        t1.valueProperty().bindBidirectional(sphere.translateXProperty());
        Label tll = new Label();
        Label translateX = new Label("X: ");
        tll.textProperty().bind(t1.valueProperty().asString());
        HBox hbox1 = new HBox(t1, translateX, tll);
        vbox1.getChildren().addAll(translate, hbox1);

        Slider t2 = new Slider();
        t2.setMax(600);
        t2.valueProperty().bindBidirectional(box.translateYProperty());
        t2.valueProperty().bindBidirectional(sphere.translateYProperty());
        Label tl2 = new Label();
        Label translateY = new Label("Y: ");
        tl2.textProperty().bind(t2.valueProperty().asString());
        HBox hbox2 = new HBox(t2, translateY, tl2);
        vbox1.getChildren().add(hbox2);

        Slider t3 = new Slider();
        t3.setMax(600);
        t3.valueProperty().bindBidirectional(box.translateZProperty());
        t3.valueProperty().bindBidirectional(sphere.translateZProperty());
        Label tl3 = new Label();
        Label translateZ = new Label("Z: ");
        tl3.textProperty().bind(t3.valueProperty().asString());
        HBox hbox3 = new HBox(t3, translateZ, tl3);
        vbox1.getChildren().add(hbox3);

        VBox vbox2 = new VBox();
        Label rotate = new Label("Rotate");

        Slider r1 = new Slider();
        r1.setMax(600);
        r1.valueProperty().bindBidirectional(box.rotateProperty());
        r1.valueProperty().bindBidirectional(sphere.rotateProperty());
        Label rll = new Label();
        rll.textProperty().bind(r1.valueProperty().asString());
        HBox rbox1 = new HBox(r1, rll);
        vbox2.getChildren().addAll(rotate, rbox1);

        VBox vbox3 = new VBox();
        Label rotationAxis = new Label("RotationAxis");

        Slider ra1 = new Slider();
        ra1.setMax(600);
        Label rall = new Label();
        Label rotationAxisX = new Label("X: ");
        rall.textProperty().bind(ra1.valueProperty().asString());
        HBox hrabox1 = new HBox(ra1, rotationAxisX, rall);
        vbox3.getChildren().addAll(rotationAxis, hrabox1);

        Slider ra2 = new Slider();
        ra2.setMax(600);
        Label ral2 = new Label();
        Label rotationAxisY = new Label("Y: ");
        ral2.textProperty().bind(ra2.valueProperty().asString());
        HBox hrabox2 = new HBox(ra2, rotationAxisY, ral2);
        vbox3.getChildren().add(hrabox2);

        Slider ra3 = new Slider();
        ra3.setMax(600);
        Label ral3 = new Label();
        Label rotationAxisZ = new Label("Z: ");
        ral3.textProperty().bind(ra3.valueProperty().asString());
        HBox hrabox3 = new HBox(ra3, rotationAxisZ, ral3);
        vbox3.getChildren().add(hrabox3);

        ra1.valueProperty().addListener((ObservableValue<? extends Number> ov, Number oldValue, Number newValue) -> {
            Point3D point3D = new Point3D(ra1.valueProperty().doubleValue(), ra2.valueProperty().doubleValue(), ra3.valueProperty().doubleValue());
            box.setRotationAxis(point3D);
            sphere.setRotationAxis(point3D);
        });

        ra2.valueProperty().addListener((ObservableValue<? extends Number> ov, Number oldValue, Number newValue) -> {
            Point3D point3D = new Point3D(ra1.valueProperty().doubleValue(), ra2.valueProperty().doubleValue(), ra3.valueProperty().doubleValue());
            box.setRotationAxis(point3D);
            sphere.setRotationAxis(point3D);
        });

        ra3.valueProperty().addListener((ObservableValue<? extends Number> ov, Number oldValue, Number newValue) -> {
            Point3D point3D = new Point3D(ra1.valueProperty().doubleValue(), ra2.valueProperty().doubleValue(), ra3.valueProperty().doubleValue());
            box.setRotationAxis(point3D);
            sphere.setRotationAxis(point3D);
        });

        VBox vbox4 = new VBox();
        Label scale = new Label("Scale");

        Slider sc1 = new Slider();
        sc1.setMax(3);
        sc1.valueProperty().bindBidirectional(box.scaleXProperty());
        sc1.valueProperty().bindBidirectional(sphere.scaleXProperty());
        Label scll = new Label();
        Label scaleX = new Label("X: ");
        scll.textProperty().bind(sc1.valueProperty().asString());
        HBox scbox1 = new HBox(sc1, scaleX, scll);
        vbox4.getChildren().addAll(scale, scbox1);

        Slider sc2 = new Slider();
        sc2.setMax(3);
        sc2.valueProperty().bindBidirectional(box.scaleYProperty());
        sc2.valueProperty().bindBidirectional(sphere.scaleYProperty());
        Label scl2 = new Label();
        Label scaleY = new Label("Y: ");
        scl2.textProperty().bind(sc2.valueProperty().asString());
        HBox hscbox2 = new HBox(sc2, scaleY, scl2);
        vbox4.getChildren().add(hscbox2);

        Slider sc3 = new Slider();
        sc3.setMax(3);
        sc3.valueProperty().bindBidirectional(box.scaleZProperty());
        sc3.valueProperty().bindBidirectional(sphere.scaleZProperty());
        Label scl3 = new Label();
        Label scaleZ = new Label("Z: ");
        scl3.textProperty().bind(sc3.valueProperty().asString());
        HBox hscbox3 = new HBox(sc3, scaleZ, scl3);
        vbox4.getChildren().add(hscbox3);

        RadioButton radioBox = new RadioButton("Box");
        RadioButton radioSphere = new RadioButton("Sphere");
        ToggleGroup groupToggle = new ToggleGroup();
        radioBox.setToggleGroup(groupToggle);
        radioSphere.setToggleGroup(groupToggle);
        HBox radioHBox = new HBox(radioBox, radioSphere);
        radioHBox.setSpacing(30);
        radioHBox.setPadding(new Insets(10, 0, 0, 30));
        radioBox.setSelected(true);
        groupToggle.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (radioBox.isSelected()) {
                pane.getChildren().remove(sphere);
                pane.getChildren().add(box);
            } else {
                pane.getChildren().remove(box);
                pane.getChildren().add(sphere);
            }
        });

        vbox.getChildren().add(vbox1);
        vbox.getChildren().add(vbox2);
        vbox.getChildren().add(vbox3);
        vbox.getChildren().add(vbox4);
        vbox.getChildren().add(radioHBox);
        root.getChildren().addAll(pane, vbox);
        Scene scene = new Scene(root, 900, 600);
        s.setScene(scene);
        s.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
