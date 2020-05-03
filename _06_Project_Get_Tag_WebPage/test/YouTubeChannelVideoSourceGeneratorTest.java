package _06_Project_Get_Tag_WebPage.test;

import _06_Project_Get_Tag_WebPage.gvideo.platforms_youtube.YouTubeChannelVideoSourceGenerator;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class YouTubeChannelVideoSourceGeneratorTest {

    public static void main(String[] args) {
        String userLink = "https://www.youtube.com/user/alresalaa11/channels";
        String channelLink = "https://www.youtube.com/channel/UC4mY_J23d9Fmvc6oDQ2K8bg";

        YouTubeChannelVideoSourceGenerator generator = new YouTubeChannelVideoSourceGenerator();
        if (generator.isMatch(userLink)) {
            System.out.println(generator.generateIfMatch(userLink));
        }
        if (generator.isMatch(channelLink)) {
            System.out.println(generator.generateIfMatch(channelLink));
        }
        System.out.println();
    }

}
