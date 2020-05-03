package _06_Project_Get_Tag_WebPage.gvideo.model;

import java.util.Iterator;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class StoredVideoSource implements VideoSource {

    private final VideoSource base;
    private final String url;

    public StoredVideoSource(VideoSource base, String url) {
        this.base = base;
        this.url = url;
    }

    @Override
    public Iterator<Video> iterator() {
        return base.iterator();
    }

    @Override
    public String toString() {
        return base.toString();
    }

    public String getUrl() {
        return url;
    }

}
