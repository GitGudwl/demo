package com.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        int result = calculator.compute(10, 5, "+");
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
        int result = calculator.compute(10, 5, "-");
        assertEquals(5, result);
    }

    @Test
    public void testMultiplication() {
        int result = calculator.compute(10, 5, "*");
        assertEquals(50, result);
    }

    @Test
    public void testDivision() {
        int result = calculator.compute(10, 5, "/");
        assertEquals(2, result);
    }

    @Test
    public void testDivisionByZero() {
        // Division by zero should throw an exception
        try {
            calculator.compute(10, 0, "/");
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            // Check if the exception message matches the expected message
            assertEquals("Tidak dapat melakukan pembagian dengan nol.", e.getMessage());
        }
    }

    @Test
    public void testInvalidOperand() {
        try {
            calculator.compute(50000, 2, "+");
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            // Check if the exception message matches the expected message
            assertEquals("Operand harus berada di rentang -32768 sampai 32767.", e.getMessage());
        }
    }

    @Test
    public void testInvalidOperator() {
        try {
            calculator.compute(32, 2, "s");
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            // Check if the exception message matches the expected message
            assertEquals("Operator tidak valid.", e.getMessage());
        }
    }
}
