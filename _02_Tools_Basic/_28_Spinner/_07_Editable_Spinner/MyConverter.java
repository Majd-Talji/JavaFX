package _02_Tools_Basic._28_Spinner._07_Editable_Spinner;

import javafx.util.StringConverter;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class MyConverter extends StringConverter<Integer> {

    @Override
    public String toString(Integer object) {
        return object + "";
    }

    @Override
    public Integer fromString(String string) {
        return Integer.parseInt(string);
    }
    
}
