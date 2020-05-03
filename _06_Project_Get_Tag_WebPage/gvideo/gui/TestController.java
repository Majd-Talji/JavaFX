package _06_Project_Get_Tag_WebPage.gvideo.gui;

import _06_Project_Get_Tag_WebPage.gvideo.model.Storage;
import _06_Project_Get_Tag_WebPage.gvideo.model.StoredVideoSource;
import _06_Project_Get_Tag_WebPage.gvideo.model.Video;
import _06_Project_Get_Tag_WebPage.gvideo.model.VideoSource;
import _06_Project_Get_Tag_WebPage.gvideo.model.VideoSourceGenerator;
import _06_Project_Get_Tag_WebPage.gvideo.platforms_youtube.YouTubeChannelVideoSourceGenerator;
import _06_Project_Get_Tag_WebPage.gvideo.platforms_youtube.YouTubeUserVideoSourceGenerator;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class TestController implements Initializable {

    @FXML
    private ListView<StoredVideoSource> sourceList;

    @FXML
    private ListView<Video> videoList;

    @FXML
    private BorderPane videoParent;

    @FXML
    private SplitPane splitPane;

    private Storage storage;

    private int videoSourceCounter = 0;

    private final String FILE_NAME = "C:/MyFiles/storage.txt";
    private final String VIDEO_SOURCE_KEY = "videoSource";

    private static final VideoSourceGenerator[] generator = {
        new YouTubeChannelVideoSourceGenerator(),
        new YouTubeUserVideoSourceGenerator()
    };

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        storage = new Storage();
        loadData();

        if (videoSourceCounter == 0) {
            // Examble
            String userYouTube = "https://www.youtube.com/user/dfdfedeify/channels";
            addSourceByUrl(userYouTube, true);
            String channelYouTube = "https://www.youtube.com/channel/UCpr977i3R7Ulv_jp04FgSTA";
            addSourceByUrl(channelYouTube, true);
        }

        sourceList.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                videoList.getItems().clear();
                for (Video v : newValue) {
                    videoList.getItems().add(v);
                }
            }
        });

        videoList.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                videoParent.setCenter(newValue.createNode());
            }
        });

    }

    private boolean addSourceByUrl(String url, boolean addToStorage) {
        for (VideoSourceGenerator g : generator) {
            if (g.isMatch(url)) {
                VideoSource videoSource = g.generateIfMatch(url);
                if (videoSource != null) {
                    StoredVideoSource stored = new StoredVideoSource(videoSource, url);
                    sourceList.getItems().add(stored);
                    if (addToStorage) {
                        addToStorage(stored);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void addSource(ActionEvent event) {
        TextInputDialog inputDialog = new TextInputDialog();
        inputDialog.setContentText("Enter a URL where the videos you want can be found.");
        Optional<String> optional = inputDialog.showAndWait();
        if (optional.isPresent()) {
            if (!addSourceByUrl(optional.get(), true)) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Video source could not be added.");
                alert.show();
            }
        }
    }

    private void addToStorage(StoredVideoSource stored) {
        storage.storeString(VIDEO_SOURCE_KEY + videoSourceCounter, stored.getUrl());
        videoSourceCounter++;
        try {
            storage.store(new FileOutputStream(FILE_NAME));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void loadData() {
        try {
            storage.load(new FileInputStream(FILE_NAME));
            for (; storage.getString(VIDEO_SOURCE_KEY + videoSourceCounter) != null; videoSourceCounter++) {
                String url = storage.getString(VIDEO_SOURCE_KEY + videoSourceCounter);
                addSourceByUrl(url, false);
            }
        } catch (Exception ex) {

        }
    }

    public void showOrHideLists(ActionEvent event) {
        if (splitPane.getItems().contains(videoList)) {
            splitPane.getItems().remove(videoList);
        } else {
            splitPane.getItems().add(0, videoList);
        }
        videoList.setMinWidth(150);

        if (splitPane.getItems().contains(sourceList)) {
            splitPane.getItems().remove(sourceList);
        } else {
            splitPane.getItems().add(0, sourceList);
        }
        sourceList.setMaxWidth(150);
    }

}
