package _06_Project_Get_Tag_WebPage.gvideo.platforms_youtube;

import _06_Project_Get_Tag_WebPage.gvideo.model.Video;
import java.util.Iterator;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class YouTubeVideoEntryTagIterator implements Iterator<Video> {

    private final Elements entryTags;
    private int counter = 0;

    public YouTubeVideoEntryTagIterator(Elements entryTags) {
        this.entryTags = entryTags;
    }

    @Override
    public boolean hasNext() {
        return counter < entryTags.size();
    }

    @Override
    public YouTubeVideo next() {
        Element entryTag = entryTags.get(counter);
        Elements titleElements = entryTag.getElementsByTag("title");
        Elements idElements = entryTag.getElementsByTag("yt:videoId");
        YouTubeVideo result = new YouTubeVideo(idElements.get(0).text(), titleElements.get(0).text());
        counter++;
        return result;
    }

}
