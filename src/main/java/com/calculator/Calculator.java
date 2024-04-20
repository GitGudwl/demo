package com.calculator;

import java.util.HashMap;
import java.util.Map;
import com.calculator.Operation.*;

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
            throw new IllegalArgumentException("Operand harus berada di rentang -32768 sampai 32767.");
        }

        // Validasi operator
        if (!operations.containsKey(operator)) {
            throw new IllegalArgumentException("Operator tidak valid.");
        }

        // Melakukan perhitungan

        Operation operation = operations.get(operator);
        return operation.apply(operand1, operand2);

    }

    private boolean isValid(int number) {
        return number >= -32768 && number <= 32767;
    }
}
