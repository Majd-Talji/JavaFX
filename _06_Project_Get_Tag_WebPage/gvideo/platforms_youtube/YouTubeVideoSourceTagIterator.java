package _06_Project_Get_Tag_WebPage.gvideo.platforms_youtube;

import _06_Project_Get_Tag_WebPage.gvideo.model.Video;
import java.util.Iterator;
import org.jsoup.select.Elements;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class YouTubeVideoSourceTagIterator implements Iterator<Video> {

    private int counter = 0;
    private final Elements videoIdTags;

    public YouTubeVideoSourceTagIterator(Elements videoIdTags) {
        this.videoIdTags = videoIdTags;
    }

    @Override
    public boolean hasNext() {
        return counter < videoIdTags.size();
    }

    @Override
    public YouTubeVideo next() {
        String videoId = videoIdTags.get(counter).text();
        YouTubeVideo result = new YouTubeVideo(videoId);
        counter++;
        return result;
    }

}
