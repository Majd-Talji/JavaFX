package _04_Drawing_Coloring_Animation._05_Charts._03_Area_Chart._03_Object_AreaChart;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        NumberAxis xAxis = new NumberAxis(1, 31, 1);

        NumberAxis yAxis = new NumberAxis(-10, 35, 5);

        AreaChart areaChart = new AreaChart(xAxis, yAxis);

        areaChart.setTitle("Temperature Monitoring (in Degrees C)");

        areaChart.setCreateSymbols(false);

        Series marchSeries = new Series();
        marchSeries.setName("March");
        marchSeries.getData().add(new Data(1, 12));
        marchSeries.getData().add(new Data(5, 16));
        marchSeries.getData().add(new Data(10, 18));
        marchSeries.getData().add(new Data(15, 26));
        marchSeries.getData().add(new Data(20, 30));
        marchSeries.getData().add(new Data(25, 24));
        marchSeries.getData().add(new Data(30, 19));
        marchSeries.getData().add(new Data(31, 18));

        Series aprilSeries = new Series();
        aprilSeries.setName("April");
        aprilSeries.getData().add(new Data(1, 18));
        aprilSeries.getData().add(new Data(5, 22));
        aprilSeries.getData().add(new Data(10, 28));
        aprilSeries.getData().add(new Data(15, 24));
        aprilSeries.getData().add(new Data(20, 26));
        aprilSeries.getData().add(new Data(25, 32));
        aprilSeries.getData().add(new Data(30, 31));

        Series februarySeries = new Series();
        februarySeries.setName("February");
        februarySeries.getData().add(new Data(1, -4));
        februarySeries.getData().add(new Data(5, -2));
        februarySeries.getData().add(new Data(10, -9));
        februarySeries.getData().add(new Data(15, -2));
        februarySeries.getData().add(new Data(20, 8));
        februarySeries.getData().add(new Data(25, 18));
        februarySeries.getData().add(new Data(28, 14));

        areaChart.getData().add(marchSeries);
        areaChart.getData().add(aprilSeries);
        areaChart.getData().add(februarySeries);

        StackPane root = new StackPane();

        root.setPadding(new Insets(10));

        root.getChildren().add(areaChart);

        Scene scene = new Scene(root, 600, 340);

        stage.setTitle("JavaFX Area Chart");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
