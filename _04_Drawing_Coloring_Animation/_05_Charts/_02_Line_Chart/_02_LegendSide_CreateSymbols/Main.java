package _04_Drawing_Coloring_Animation._05_Charts._02_Line_Chart._02_LegendSide_CreateSymbols;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Side;
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

        NumberAxis yAxis = new NumberAxis(0, 10_000_000, 1_000_000);

        LineChart lineChart = new LineChart(xAxis, yAxis);
        
        lineChart.setLegendSide(Side.RIGHT);
        
        lineChart.setCreateSymbols(false);

        lineChart.setTitle("Favourite Opeating System in USA");

        Series androidSeries = new Series();
        androidSeries.setName("Android Users");
        androidSeries.getData().add(new Data(2010, 3885642));
        androidSeries.getData().add(new Data(2011, 5153455));
        androidSeries.getData().add(new Data(2012, 6620012));
        androidSeries.getData().add(new Data(2013, 6550220));
        androidSeries.getData().add(new Data(2014, 7100253));
        androidSeries.getData().add(new Data(2015, 9422689));
        androidSeries.getData().add(new Data(2016, 6800234));
        androidSeries.getData().add(new Data(2017, 5226890));
        androidSeries.getData().add(new Data(2018, 6112690));
        androidSeries.getData().add(new Data(2019, 7826789));
        androidSeries.getData().add(new Data(2020, 7022689));
        
        Series iosSeries = new Series();
        iosSeries.setName("IOS Users");
        iosSeries.getData().add(new Data(2010, 4885135));
        iosSeries.getData().add(new Data(2011, 5856655));
        iosSeries.getData().add(new Data(2012, 6020012));
        iosSeries.getData().add(new Data(2013, 5850220));
        iosSeries.getData().add(new Data(2014, 5400253));
        iosSeries.getData().add(new Data(2015, 7722689));
        iosSeries.getData().add(new Data(2016, 7900234));
        iosSeries.getData().add(new Data(2017, 6926890));
        iosSeries.getData().add(new Data(2018, 8012690));
        iosSeries.getData().add(new Data(2019, 8526789));
        iosSeries.getData().add(new Data(2020, 7922689));

        lineChart.getData().add(androidSeries);
        lineChart.getData().add(iosSeries);

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
