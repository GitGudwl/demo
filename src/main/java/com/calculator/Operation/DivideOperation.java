package com.calculator.Operation;

public class DivideOperation implements Operation {
    @Override
    public int apply(int operand1, int operand2) {
        if (operand2 == 0) {
            return 0;
        }
        return operand1 / operand2;
    }
}