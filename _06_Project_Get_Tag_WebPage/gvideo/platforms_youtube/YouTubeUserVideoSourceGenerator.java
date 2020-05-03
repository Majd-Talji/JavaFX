package _06_Project_Get_Tag_WebPage.gvideo.platforms_youtube;

import _06_Project_Get_Tag_WebPage.gvideo.model.VideoSource;
import _06_Project_Get_Tag_WebPage.gvideo.model.VideoSourceGenerator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class YouTubeUserVideoSourceGenerator implements VideoSourceGenerator {

    // https://www.youtube.com/user/alresalaa11/channels
    private static final String REGEX = "https?://www\\.youtube\\.com/user/([A-Za-z0-9_\\-]+).*";

    @Override
    public boolean isMatch(String url) {
        return url.matches(REGEX);
    }

    @Override
    public VideoSource generateIfMatch(String url) {
        Matcher m = Pattern.compile(REGEX).matcher(url);
        m.matches();
        try {
            return new YouTubeUserVideoSource(m.group(1));
        } catch (Exception ex) {
            return null;
        }
    }

}
