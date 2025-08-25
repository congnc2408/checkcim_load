package com.autotest.check_cimload;

import com.autotest.check_cimload.config.MysqlConnector;
import com.autotest.check_cimload.service.Zimi_Service_Imp;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Connection con = MysqlConnector.getConnect();
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Check Cimload Tool");
        stage.setScene(scene);
        stage.show();

//        Zimi_Service_Imp zimiService = new Zimi_Service_Imp();
//        System.out.println("Zimi List: " + zimiService.getZimiList().size());

    }

    public static void main(String[] args) {
        launch();
    }
}