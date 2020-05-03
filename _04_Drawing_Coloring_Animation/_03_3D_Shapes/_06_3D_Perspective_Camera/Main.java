package _04_Drawing_Coloring_Animation._03_3D_Shapes._06_3D_Perspective_Camera;

import java.util.Random;
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Point3D;
import javafx.scene.AmbientLight;
import javafx.scene.Node;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
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

        SubScene sub = new SubScene(pane, 600, 600);

        Random r = new Random();
        for (int y = 10; y > -10; y--) {
            for (int x = 10; x > -10; x--) {
                Box b = new Box(512, 512, 512);
                PhongMaterial m = new PhongMaterial(Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
                b.setMaterial(m);
                b.setManaged(false);
                b.setTranslateX(1000 * x);
                b.setTranslateZ(1000 * y);
                pane.getChildren().add(b);
            }
        }

        PerspectiveCamera cam = new PerspectiveCamera();

        pane.setOnMouseClicked((event) -> {
            Node clicked = event.getPickResult().getIntersectedNode();
            pane.getChildren().remove(clicked);
        });

        cam.setTranslateY(-1000);// Contorl banal
        sub.setCamera(cam);

        VBox vbox = new VBox();
        vbox.setPadding(new Insets(5));

        VBox vbox1 = new VBox();

        Label translate = new Label("Translate");

        Slider t1 = new Slider();
        t1.setMin(-20000);
        t1.setMax(20000);
        t1.valueProperty().bindBidirectional(cam.translateXProperty());
        Label tll = new Label();
        Label translateX = new Label("X: ");
        tll.textProperty().bind(t1.valueProperty().asString());
        HBox hbox1 = new HBox(t1, translateX, tll);
        vbox1.getChildren().addAll(translate, hbox1);

        Slider t2 = new Slider();
        t2.setMin(-20000);
        t2.setMax(20000);
        t2.valueProperty().bindBidirectional(cam.translateYProperty());
        Label tl2 = new Label();
        Label translateY = new Label("Y: ");
        tl2.textProperty().bind(t2.valueProperty().asString());
        HBox hbox2 = new HBox(t2, translateY, tl2);
        vbox1.getChildren().add(hbox2);

        Slider t3 = new Slider();
        t3.setMin(-20000);
        t3.setMax(20000);
        t3.valueProperty().bindBidirectional(cam.translateZProperty());
        Label tl3 = new Label();
        Label translateZ = new Label("Z: ");
        tl3.textProperty().bind(t3.valueProperty().asString());
        HBox hbox3 = new HBox(t3, translateZ, tl3);
        vbox1.getChildren().add(hbox3);

        VBox vbox2 = new VBox();
        Label rotate = new Label("Rotate");

        Slider r1 = new Slider();
        r1.setMax(360);
        r1.valueProperty().bindBidirectional(cam.rotateProperty());
        Label rll = new Label();
        rll.textProperty().bind(r1.valueProperty().asString());
        HBox rbox1 = new HBox(r1, rll);
        vbox2.getChildren().addAll(rotate, rbox1);

        VBox vbox3 = new VBox();
        Label rotationAxis = new Label("RotationAxis");

        Slider ra1 = new Slider();
        ra1.setMax(3);
        Label rall = new Label();
        Label rotationAxisX = new Label("X: ");
        rall.textProperty().bind(ra1.valueProperty().asString());
        HBox hrabox1 = new HBox(ra1, rotationAxisX, rall);
        vbox3.getChildren().addAll(rotationAxis, hrabox1);

        Slider ra2 = new Slider();
        ra2.setMax(3);
        Label ral2 = new Label();
        Label rotationAxisY = new Label("Y: ");
        ral2.textProperty().bind(ra2.valueProperty().asString());
        HBox hrabox2 = new HBox(ra2, rotationAxisY, ral2);
        vbox3.getChildren().add(hrabox2);

        Slider ra3 = new Slider();
        ra3.setMax(3);
        Label ral3 = new Label();
        Label rotationAxisZ = new Label("Z: ");
        ral3.textProperty().bind(ra3.valueProperty().asString());
        HBox hrabox3 = new HBox(ra3, rotationAxisZ, ral3);
        vbox3.getChildren().add(hrabox3);

        ra1.valueProperty().addListener((ObservableValue<? extends Number> ov, Number oldValue, Number newValue) -> {
            Point3D point3D = new Point3D(ra1.valueProperty().doubleValue(), ra2.valueProperty().doubleValue(), ra3.valueProperty().doubleValue());
            cam.setRotationAxis(point3D);
        });

        ra2.valueProperty().addListener((ObservableValue<? extends Number> ov, Number oldValue, Number newValue) -> {
            Point3D point3D = new Point3D(ra1.valueProperty().doubleValue(), ra2.valueProperty().doubleValue(), ra3.valueProperty().doubleValue());
            cam.setRotationAxis(point3D);
        });

        ra3.valueProperty().addListener((ObservableValue<? extends Number> ov, Number oldValue, Number newValue) -> {
            Point3D point3D = new Point3D(ra1.valueProperty().doubleValue(), ra2.valueProperty().doubleValue(), ra3.valueProperty().doubleValue());
            cam.setRotationAxis(point3D);
        });

        VBox vbox7 = new VBox();

        Label ambientLightLabel = new Label("Ambient Light");
        RadioButton ambientLightYes = new RadioButton("Yes");
        RadioButton ambientLightNo = new RadioButton("No");
        ToggleGroup groupToggleNoYes = new ToggleGroup();
        ambientLightNo.setToggleGroup(groupToggleNoYes);
        ambientLightYes.setToggleGroup(groupToggleNoYes);
        ambientLightNo.setSelected(true);
        AmbientLight ambientLight = new AmbientLight();
        groupToggleNoYes.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (ambientLightNo.isSelected()) {
                pane.getChildren().remove(ambientLight);
            } else {
                pane.getChildren().add(ambientLight);
            }
        });
        HBox hbox4 = new HBox(8, ambientLightLabel, ambientLightYes, ambientLightNo);
        vbox7.getChildren().add(hbox4);

        vbox.getChildren().add(vbox1);
        vbox.getChildren().add(vbox2);
        vbox.getChildren().add(vbox3);
        vbox.getChildren().add(vbox7);
        root.getChildren().add(sub);
        root.getChildren().add(vbox);
        Scene scene = new Scene(root, 900, 600);
        s.setScene(scene);
        s.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
