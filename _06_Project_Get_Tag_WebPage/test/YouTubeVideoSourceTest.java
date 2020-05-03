package _06_Project_Get_Tag_WebPage.test;

import _06_Project_Get_Tag_WebPage.gvideo.model.Video;
import _06_Project_Get_Tag_WebPage.gvideo.platforms_youtube.YouTubeUserVideoSource;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class YouTubeVideoSourceTest {
    
    public static void main(String[] args) throws Exception{
        for (Video v : new YouTubeUserVideoSource("oplkanal")) {
            System.out.println(v);
        }
    }
    
}
