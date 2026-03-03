package com.autotest.check_cimload.config;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AlertUltils {

    public static void showInformationAlert(String title, String header, String content) {
        createAndShowAlert(AlertType.INFORMATION, title, header, content);
    }

    public static void showWarningAlert(String title, String header, String content) {
        createAndShowAlert(AlertType.WARNING, title, header, content);
    }

    public static void showErrorAlert(String title, String header, String content) {
        createAndShowAlert(AlertType.ERROR, title, header, content);
    }

    private static void createAndShowAlert(AlertType type,String title,String header,String content){
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }

}
