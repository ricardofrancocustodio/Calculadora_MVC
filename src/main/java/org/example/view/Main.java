package org.example.view;

import org.example.controller.divisao.DivisaoController;
import org.example.controller.multiplicacao.MultiplicacaoController;
import org.example.controller.soma.SomaController;
import org.example.controller.subtracao.SubtracaoController;
import org.example.repository.divisao.DivisionRepository;
import org.example.repository.multiplicacao.MultiplicacaoRepository;
import org.example.repository.soma.SomaRepository;
import org.example.repository.subtracao.SubtracaoRepository;
import org.example.service.ValidacaoService;
import org.example.service.divisao.DivisaoService;
import org.example.service.multiplicacao.MultiplicacaoService;
import org.example.service.soma.SomaService;
import org.example.service.subtracao.SubtracaoService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            // Cria a conexão com o banco de dados
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/calculadora_mvc", "root", "");

            // Soma Instances
            SomaRepository somaRepository = new SomaRepository(connection);
            DivisionRepository divisionRepository =  new DivisionRepository(connection);
            MultiplicacaoRepository multiplicacaoRepository = new MultiplicacaoRepository(connection);
            SubtracaoRepository subtracaoRepository =  new SubtracaoRepository(connection);

            SomaService somaService = new SomaService(somaRepository);
            DivisaoService divisaoService = new DivisaoService(divisionRepository);
            MultiplicacaoService multiplicacaoService =  new MultiplicacaoService(multiplicacaoRepository);
            SubtracaoService subtracaoService =  new SubtracaoService(subtracaoRepository);


            ValidacaoService validacaoService = new ValidacaoService(5, 10);
            SomaController somaController = new SomaController(somaService, validacaoService);
            DivisaoController divisaoController =  new DivisaoController(divisaoService, validacaoService);
            MultiplicacaoController multiplicacaoController = new MultiplicacaoController(multiplicacaoService, validacaoService);
            SubtracaoController subtracaoController =  new SubtracaoController(subtracaoService, validacaoService);


            // Chama o controlador para calcular a soma e salvar no banco
            Integer resultadoSoma = somaController.calcular(5, 10);
            Integer resultadoDivisao = divisaoController.calcular(10, 5);
            Integer resultadoMultiplicacao = multiplicacaoController.calcular(10, 5);
            Integer resultadoSubtracao = subtracaoController.calcular(10, 5);


            System.out.println("Resultado da soma: " + resultadoSoma);
            System.out.println("Resultado da divisao: " + resultadoDivisao);
            System.out.println("Resultado da multiplicacao: " + resultadoMultiplicacao);
            System.out.println("Resultado da subtracao: " + resultadoSubtracao);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
