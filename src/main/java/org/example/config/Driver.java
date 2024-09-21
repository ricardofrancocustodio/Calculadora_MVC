package org.example.config;

import org.example.config.ConnectionFactory;

import java.sql.*;

public class Driver {
    public static void main(String[] args) {
        try (Connection connection = ConnectionFactory.getConnection()) {
            // Preparar a query
            String sql = "SELECT * FROM usuarios";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            // Iterar sobre os resultados
            while (resultSet.next()) {
                String nome = resultSet.getString("nome");
                String email = resultSet.getString("email");
                System.out.println("Nome: " + nome + ", Email: " + email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}