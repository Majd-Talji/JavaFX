package _04_Drawing_Coloring_Animation._05_Charts._04_Bar_Chart._02_CategoryGap;

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
        
        barChart.setTitle("Cars Comparison Result");
        
        barChart.setCategoryGap(60);
        
        Series audiSeries = new Series();
        audiSeries.setName("Audi");
        audiSeries.getData().add(new Data("Speed", 8));
        audiSeries.getData().add(new Data("Safety", 5));
        audiSeries.getData().add(new Data("Milage", 7));
        audiSeries.getData().add(new Data("User Rating", 6));
        
        Series faitSeries = new Series();
        faitSeries.setName("Fiat");
        faitSeries.getData().add(new Data(xAxis.getCategories().get(0), 6));
        faitSeries.getData().add(new Data(xAxis.getCategories().get(1), 8));
        faitSeries.getData().add(new Data(xAxis.getCategories().get(2), 8));
        faitSeries.getData().add(new Data(xAxis.getCategories().get(3), 5));
        
        Series mercedesSeries = new Series();
        mercedesSeries.setName("Mercedes");
        mercedesSeries.getData().add(new Data("Speed", 9));
        mercedesSeries.getData().add(new Data("Safety", 8));
        mercedesSeries.getData().add(new Data("Milage", 6));
        mercedesSeries.getData().add(new Data("User Rating", 8));
        
        barChart.getData().addAll(audiSeries,faitSeries,mercedesSeries);
        
        StackPane root = new StackPane();
        
        root.setPadding(new Insets(10));
        
        root.getChildren().add(barChart);
        
        Scene scene = new Scene(root, 600, 340);
        
        stage.setTitle("JavaFX Bar Chart");
        
        stage.setScene(scene);
        
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
