package _02_Tools_Basic._11_ListView._09_Colors_ListView;

import javafx.scene.control.ListCell;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class ColorRectCell extends ListCell<String> {

    @Override
    protected void updateItem(String item, boolean empty) {
        super.updateItem(item, empty);

        Rectangle rect = new Rectangle(122, 20);

        if (item != null) {
            rect.setFill(Color.web(item));
            setGraphic(rect);
        } else {
            setGraphic(null);
        }
    }

}
