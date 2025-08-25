package com.autotest.check_cimload.config;

import java.sql.Connection;

import static java.sql.DriverManager.getConnection;

public class MysqlConnector {
    private static final String url = "jdbc:mysql://localhost:3306/vimi";
    private static final String userName = "root";
    private static final String password = "nccong";

    public static Connection getConnect() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = getConnection(url, userName, password);
            System.out.println("Connection established successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Failed to connect to the database. Please check your connection settings.");
        }
        return connection;
    }
}
