package org.example.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public ConnectionFactory() throws SQLException {
        getConnection();
    }
    private static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/calculadora_mvc";
        String user = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            throw new SQLException(e);
        }
    }

}
