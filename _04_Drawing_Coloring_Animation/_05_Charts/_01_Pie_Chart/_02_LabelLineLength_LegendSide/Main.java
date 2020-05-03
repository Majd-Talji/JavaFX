package _04_Drawing_Coloring_Animation._05_Charts._01_Pie_Chart._02_LabelLineLength_LegendSide;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        PieChart pieChart = new PieChart();

        ObservableList<Data> chartData = FXCollections.observableArrayList(
                new Data("Iphone X", 25),
                new Data("Nokia Lumia 1020", 12),
                new Data("Huawei P30", 26),
                new Data("Samsung S9", 24),
                new Data("Google Pixel 3", 16)
        );

        pieChart.setTitle("Mobile Sales 2019");

        pieChart.setData(chartData);

        pieChart.setLabelLineLength(15);

        pieChart.setLegendSide(Side.LEFT);

        StackPane root = new StackPane();

        root.getChildren().add(pieChart);

        Scene scene = new Scene(root, 550, 320);

        stage.setTitle("JavaFX Pie Chart");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
