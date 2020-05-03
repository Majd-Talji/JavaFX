package _06_Project_Get_Tag_WebPage.gvideo.platforms_youtube;

import _06_Project_Get_Tag_WebPage.gvideo.model.Video;
import _06_Project_Get_Tag_WebPage.gvideo.model.VideoSource;
import java.net.URL;
import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class YouTubeChannelVideoSource implements VideoSource {

    private final Elements videoIdTags;
    private final Elements entryTags;
    private final String nameChannel;

    public YouTubeChannelVideoSource(String channelId) throws Exception {
        // https://www.youtube.com/feeds/videos.xml?channel_id=UC3RubKcEIoBhopa8CRhg7VQ
        URL rssLink = new URL("https://www.youtube.com/feeds/videos.xml?channel_id=" + channelId);
        Document htmlDocument = Jsoup.parse(rssLink, 10000);
        this.videoIdTags = htmlDocument.getElementsByTag("yt:videoId");
        this.entryTags = htmlDocument.getElementsByTag("entry");

        Element entryTag = entryTags.get(0);
        Elements titleElements = entryTag.getElementsByTag("name");
        this.nameChannel = titleElements.get(0).text();
    }

    @Override
    public Iterator<Video> iterator() {
        return new YouTubeVideoEntryTagIterator(entryTags);
    }

    @Override
    public String toString() {
        if (nameChannel == null) {
            return super.toString();
        } else {
            return "YouTube Channel: " + this.nameChannel;
        }
    }

}
