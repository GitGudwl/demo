package com.calculator.Operation;

public class DivideOperation implements Operation {
    @Override
    public int apply(int operand1, int operand2) {
        if (operand2 == 0) {
            throw new IllegalArgumentException("Tidak dapat melakukan pembagian dengan nol.");
        }
        return operand1 / operand2;
    }
}