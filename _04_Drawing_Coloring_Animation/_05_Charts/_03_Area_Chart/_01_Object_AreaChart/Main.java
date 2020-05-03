package _04_Drawing_Coloring_Animation._05_Charts._03_Area_Chart._01_Object_AreaChart;

import javafx.application.Application;
import javafx.geometry.Insets;
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

        NumberAxis yAxis = new NumberAxis(0, 40, 5);

        AreaChart areaChart = new AreaChart(xAxis, yAxis);
        
        areaChart.setTitle("Temperature Monitoring (in Degrees C)");
        
        Series series = new Series();
        
        series.setName("April");
        
        series.getData().add(new Data(1, 18));
        series.getData().add(new Data(5, 22));
        series.getData().add(new Data(10, 28));
        series.getData().add(new Data(15, 24));
        series.getData().add(new Data(20, 26));
        series.getData().add(new Data(25, 32));
        series.getData().add(new Data(30, 31));
        
        areaChart.getData().add(series);
        
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
