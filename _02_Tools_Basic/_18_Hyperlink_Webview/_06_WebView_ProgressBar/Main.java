package _02_Tools_Basic._18_Hyperlink_Webview._06_WebView_ProgressBar;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.concurrent.Worker.State;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        TextField addressBar = new TextField("https://eclipse.org");
        Button goButton = new Button("Go!");
        Label stateLabel = new Label();

        stateLabel.setTextFill(Color.RED);
        ProgressBar progressBar = new ProgressBar();

        final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();

        Worker<Void> worker = webEngine.getLoadWorker();

        worker.stateProperty().addListener(new ChangeListener<State>() {
            @Override
            public void changed(ObservableValue<? extends State> observable, Worker.State oldValue, Worker.State newValue) {
                stateLabel.setText("Loading state: " + newValue.toString());
                if (newValue == Worker.State.SUCCEEDED) {
                    stage.setTitle(webEngine.getLocation());
                    stateLabel.setText("Finish!");
                }
            }
        });

        progressBar.progressProperty().bind(worker.progressProperty());

        goButton.setOnAction((ActionEvent e) -> {
            String url = addressBar.getText();
            webEngine.load(url);
        });

        addressBar.setOnAction((ActionEvent e) -> {
            String url = "https://eclipse.org";
            webEngine.load(url);
        });

        VBox root = new VBox();
        root.setPadding(new Insets(5));
        root.setSpacing(5);

        root.getChildren().add(addressBar);

        HBox hBox = new HBox(5, goButton, progressBar, stateLabel);
        root.getChildren().addAll(hBox, browser);

        Scene scene = new Scene(root, 600, 500);

        stage.setTitle("JavaFX WebView");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
