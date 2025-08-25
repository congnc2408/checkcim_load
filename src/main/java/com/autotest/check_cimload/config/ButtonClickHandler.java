package com.autotest.check_cimload.config;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class ButtonClickHandler {

    public  File handleButtonClickFileChooser(Button btn, Stage pri) {
        //File initialDirectory = new File("\\\\vnad\\Apps\\swsystem\\Quality\\IQC\\vIMI\\Output\\Cimload");
        File initialDirectory = new File("C:\\Users\\nccong\\Desktop");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                FileChooser fileChooser = new FileChooser();

                fileChooser.setTitle("Chọn file Excel");
//                fileChooser.getExtensionFilters().add(
//                        new FileChooser.ExtensionFilter("Excel Files", "*.xlsx", "*.xls")
//                );
                fileChooser.getExtensionFilters().add(
                        new FileChooser.ExtensionFilter("CSV Files", "*.csv")
                );
                fileChooser.setInitialDirectory(initialDirectory);

                fileChooser.showOpenDialog(pri);
            }
        });
        return initialDirectory;
    }
}
