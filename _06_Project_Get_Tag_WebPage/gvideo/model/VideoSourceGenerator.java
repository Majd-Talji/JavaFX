package _06_Project_Get_Tag_WebPage.gvideo.model;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public interface VideoSourceGenerator {

    boolean isMatch(String url);

    VideoSource generateIfMatch(String url);

}
