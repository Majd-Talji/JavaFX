package _01_Basis._01_Simple_Application;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class _01_launch_main extends Application {

    public static void main(String[] args) {
        System.out.println("main() method is called.");
        launch();
    }

    @Override
    public void init() {
        System.out.println("init() method is called.");
    }

    @Override
    public void start(Stage primaryStage) {
        System.out.println("start() method is called.");
        primaryStage.show();
    }

    @Override
    public void stop() {
        System.out.println("stop() method is called.");
    }

}
