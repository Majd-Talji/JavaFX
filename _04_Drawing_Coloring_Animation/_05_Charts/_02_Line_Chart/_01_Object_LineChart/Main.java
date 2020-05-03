package _04_Drawing_Coloring_Animation._05_Charts._02_Line_Chart._01_Object_LineChart;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.LineChart;
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

        NumberAxis xAxis = new NumberAxis(2010, 2020, 1);

        NumberAxis yAxis = new NumberAxis(0, 1000, 50);

        LineChart lineChart = new LineChart(xAxis, yAxis);

        lineChart.setTitle("Adsense");

        Series series = new Series();

        series.setName("Estimated Earnings");

        series.getData().add(new Data(2010, 0));
        series.getData().add(new Data(2011, 160));
        series.getData().add(new Data(2012, 290));
        series.getData().add(new Data(2013, 450));
        series.getData().add(new Data(2014, 590));
        series.getData().add(new Data(2015, 500));
        series.getData().add(new Data(2016, 720));
        series.getData().add(new Data(2017, 700));
        series.getData().add(new Data(2018, 880));
        series.getData().add(new Data(2019, 670));

        lineChart.getData().add(series);

        StackPane root = new StackPane();

        root.setPadding(new Insets(10));

        root.getChildren().add(lineChart);

        Scene scene = new Scene(root, 600, 340);

        stage.setTitle("JavaFX Line Chart");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
