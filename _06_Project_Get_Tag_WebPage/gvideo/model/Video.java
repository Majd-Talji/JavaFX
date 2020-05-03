package _06_Project_Get_Tag_WebPage.gvideo.model;

import javafx.scene.Node;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public interface Video {

    void play();

    void pause();

    void setOnFinished(Runnable r);

    boolean supportsPlay();

    boolean supportsPause();

    boolean supportsOnFinished();

    Node createNode();

}
