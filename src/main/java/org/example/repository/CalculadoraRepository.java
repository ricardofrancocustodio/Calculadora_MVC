package org.example.repository;

import org.example.model.operations.OperationModel;

import java.sql.SQLException;

public interface CalculadoraRepository {

    void save(OperationModel operationModel) throws SQLException;
    void update(OperationModel operationModel) throws SQLException;
    void delete();
    void find();

}
