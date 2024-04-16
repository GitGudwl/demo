package com.calculator;
import java.util.HashMap;
import java.util.Map;
import  com.calculator.Operation.*;

public class Calculator {

    private Map<String, Operation> operations;

    public Calculator() {
        operations = new HashMap<>();
        operations.put("+", new AddOperation());
        operations.put("-", new SubtractOperation());
        operations.put("*", new MultiplyOperation());
        operations.put("/", new DivideOperation());
    }

    public int compute(int operand1, int operand2, String operator) {
        // Validasi operand
        if (!isValid(operand1) || !isValid(operand2)) {
            System.out.println("Error: Operand harus berupa angka di range -32,768 hingga 32,767.");
            return 0;
        }

        // Validasi operator
        if (!operations.containsKey(operator)) {
            System.out.println("Error: Operator yang diperbolehkan hanya +, -, *, /.");
            return 0;
        }

        // Melakukan perhitungan
        try {
            Operation operation = operations.get(operator);
            return operation.apply(operand1, operand2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }

    private boolean isValid(int number) {
        return number >= -32768 && number <= 32767;
    }
}

