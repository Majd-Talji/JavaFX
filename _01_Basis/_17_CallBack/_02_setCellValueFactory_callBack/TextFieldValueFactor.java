package _01_Basis._17_CallBack._02_setCellValueFactory_callBack;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TextField;
import javafx.util.Callback;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
//public class MyCallBack implements Callback<CellDataFeatures<Person, TextField>, ObservableValue<TextField>> {
// T = Person();
public class TextFieldValueFactor<T> implements Callback<CellDataFeatures<T, TextField>, ObservableValue<TextField>> {

    Callback<T, Property<String>> callback;

    public TextFieldValueFactor(Callback<T, Property<String>> callback) {
        this.callback = callback;
    }

    @Override
    public ObservableValue<TextField> call(CellDataFeatures<T, TextField> param) {
//        return param.getValue().nameProperty(); String Value
        TextField tf = new TextField();
        tf.textProperty().bindBidirectional(callback.call(param.getValue()));
        return new SimpleObjectProperty<TextField>(tf);
    }

}
