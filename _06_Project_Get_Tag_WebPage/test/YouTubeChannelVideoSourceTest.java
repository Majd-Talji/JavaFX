package _06_Project_Get_Tag_WebPage.test;

import _06_Project_Get_Tag_WebPage.gvideo.model.Video;
import _06_Project_Get_Tag_WebPage.gvideo.platforms_youtube.YouTubeChannelVideoSource;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class YouTubeChannelVideoSourceTest {

    public static void main(String[] args) throws Exception {
        for (Video v : new YouTubeChannelVideoSource("UC3RubKcEIoBhopa8CRhg7VQ")) {
            System.out.println(v);
        }
    }

}
