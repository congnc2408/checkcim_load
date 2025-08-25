package com.autotest.check_cimload.config;

import com.autotest.check_cimload.model.Zimi_Mstr;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;


public class ViewTable {

    public static  <S,T> TableColumn<S, T> createColumn(String title, Callback<S, T> valueExtractor) {
        TableColumn<S, T> column = new TableColumn<>(title);
        column.setCellValueFactory(cellData ->{
            T value =  valueExtractor.call(cellData.getValue());
            return new SimpleObjectProperty<>(value);
        });
        return column;
    }
}
