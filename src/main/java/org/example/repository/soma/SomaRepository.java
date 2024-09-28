package org.example.repository.soma;

import org.example.model.operations.OperationModel;
import org.example.repository.CalculadoraRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SomaRepository implements CalculadoraRepository {

    Connection connection;

    public SomaRepository(Connection connection) {
        this.connection = connection;  // Conexão recebida do serviço de banco de dados
    }

    @Override
    public void save(OperationModel operationModel) throws SQLException {
        String query = "INSERT INTO operacoes (id_operacao, operationTypeId, number1, number2, result) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, operationModel.getIdOperacao());
            stmt.setString(2, operationModel.getOperationType());
            stmt.setInt(3, operationModel.getNumber1());
            stmt.setInt(4, operationModel.getNumber2());
            stmt.setInt(5, operationModel.getResult());

            stmt.executeUpdate();
        }

    }


    @Override
    public void update(OperationModel operationModel) {

    }

    @Override
    public void delete() {

    }

    @Override
    public void find() {

    }
}
