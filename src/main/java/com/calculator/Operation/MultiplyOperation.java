package com.calculator.Operation;

public class MultiplyOperation implements Operation {
    @Override
    public int apply(int operand1, int operand2) {
        return operand1 * operand2;
    }
}