package _04_Drawing_Coloring_Animation._05_Charts._04_Bar_Chart._01_Object_BarChart_setCreateSymbols;

import java.util.Arrays;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
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

        CategoryAxis xAxis = new CategoryAxis(FXCollections.observableArrayList(
                Arrays.asList("Speed", "Safety", "Milage", "User Rating")));

        NumberAxis yAxis = new NumberAxis(0, 12, 2);

        BarChart barChart = new BarChart(xAxis, yAxis);

        barChart.setTitle("Audi Characteristics");

        barChart.setLegendVisible(false);
        
        Series series = new Series();

        series.getData().add(new Data("Speed", 8));
        series.getData().add(new Data("Safety", 5));
        series.getData().add(new Data("Milage", 7));
        series.getData().add(new Data("User Rating", 6));
        // OR
        series.getData().add(new Data(xAxis.getCategories().get(0), 8));
        series.getData().add(new Data(xAxis.getCategories().get(1), 5));
        series.getData().add(new Data(xAxis.getCategories().get(2), 7));
        series.getData().add(new Data(xAxis.getCategories().get(3), 6));

        barChart.getData().add(series);

        StackPane root = new StackPane();

        root.setPadding(new Insets(10));

        root.getChildren().add(barChart);

        Scene scene = new Scene(root, 400, 340);

        stage.setTitle("JavaFX Bar Chart");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
