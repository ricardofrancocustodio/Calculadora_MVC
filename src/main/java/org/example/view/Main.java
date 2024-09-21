package org.example.view;

import org.example.controller.soma.SomaController;
import org.example.model.operations.OperationModel;
import org.example.repository.soma.SomaRepository;
import org.example.service.ValidacaoService;
import org.example.service.soma.SomaService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            // Cria a conexão com o banco de dados
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/calculadora_mvc", "root", "");

            // Cria as instâncias necessárias
            SomaRepository somaRepository = new SomaRepository(connection);
            SomaService somaService = new SomaService(somaRepository);
            ValidacaoService validacaoService = new ValidacaoService(5, 10);
            SomaController somaController = new SomaController(somaService, validacaoService);

            // Chama o controlador para calcular a soma e salvar no banco
            Integer resultadoSoma = somaController.calcular(5, 10);
            System.out.println("Resultado da soma: " + resultadoSoma);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
