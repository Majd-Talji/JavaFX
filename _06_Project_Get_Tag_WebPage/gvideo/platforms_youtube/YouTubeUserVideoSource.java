package _06_Project_Get_Tag_WebPage.gvideo.platforms_youtube;

import _06_Project_Get_Tag_WebPage.gvideo.model.Video;
import _06_Project_Get_Tag_WebPage.gvideo.model.VideoSource;
import java.net.URL;
import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class YouTubeUserVideoSource implements VideoSource {

    private final Elements videoIdTags;
    private final Elements entryTags;
    private final String userId;

    public YouTubeUserVideoSource(String userId) throws Exception {
        // https://www.youtube.com/feeds/videos.xml?user=oplkanal
        this.userId = userId;
        URL rssLink = new URL("https://www.youtube.com/feeds/videos.xml?user=" + userId);
        Document htmlDocument = Jsoup.parse(rssLink, 10000);
        this.videoIdTags = htmlDocument.getElementsByTag("yt:videoId");
        this.entryTags = htmlDocument.getElementsByTag("entry");
    }

    @Override
    public Iterator<Video> iterator() {
        return new YouTubeVideoEntryTagIterator(entryTags);
    }

    @Override
    public String toString() {
        return "YouTube : " + userId;
    }

}
