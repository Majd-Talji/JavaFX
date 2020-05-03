package _06_Project_Get_Tag_WebPage.gvideo.platforms_youtube;

import _06_Project_Get_Tag_WebPage.gvideo.model.Video;
import javafx.scene.Node;
import javafx.scene.web.WebView;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class YouTubeVideo implements Video {

    private final String videoId;
    private final String title;

    public YouTubeVideo(String videoId) {
        this.videoId = videoId;
        this.title = null;
    }

    YouTubeVideo(String id, String title) {
        this.videoId = id;
        this.title = title;
    }

    @Override
    public void play() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void setOnFinished(Runnable r) {
    }

    @Override
    public boolean supportsPlay() {
        return false;
    }

    @Override
    public boolean supportsPause() {
        return false;
    }

    @Override
    public boolean supportsOnFinished() {
        return false;
    }

    @Override
    public Node createNode() {
        WebView webView = new WebView();
        // URL rssLink = new URL("https://www.youtube.com/embed/" + userId);
        // webView.getEngine().load("https://www.youtube.com/watch?v=" + videoId);
        webView.getEngine().load("https://www.youtube.com/embed/" + videoId);
        return webView;
    }

    public String toString() {
        if (title == null) {
            return super.toString();
        } else {
            return this.title;
        }
    }

}
