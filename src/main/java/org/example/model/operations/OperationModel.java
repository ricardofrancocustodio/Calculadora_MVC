package org.example.model.operations;

public class OperationModel {
    private int id;
    private String operationType;
    private int number1;
    private int number2;
    private int result;

    // Construtores, getters e setters
    public OperationModel(int id, String operationTypeId, int number1, int number2, int result) {
        this.id = id;
        this.operationType = operationTypeId;
        this.number1 = number1;
        this.number2 = number2;
        this.result = result;
    }

    public int getIdOperacao() { return id; }
    public void setId(int id) { this.id = id; }

    public String getOperationType() { return operationType; }
    public void setOperationType(String operationType) { this.operationType = operationType; }

    public int getNumber1() { return number1; }
    public void setNumber1(int number1) { this.number1 = number1; }

    public int getNumber2() { return number2; }
    public void setNumber2(int number2) { this.number2 = number2; }

    public int getResult() { return result; }
    public void setResult(int result) { this.result = result; }

}
