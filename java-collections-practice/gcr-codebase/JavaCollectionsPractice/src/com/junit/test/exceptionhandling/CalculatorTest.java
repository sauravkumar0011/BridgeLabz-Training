package com.junit.test.exceptionhandling;

import org.junit.jupiter.api.Test;
import com.junit.main.exceptionhandling.Calculator;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testDivideNormal() {
        assertEquals(5, Calculator.divide(10, 2));
        assertEquals(-3, Calculator.divide(9, -3));
    }

    @Test
    public void testDivideByZero() {
        ArithmeticException exception = assertThrows(
            ArithmeticException.class,
            () -> Calculator.divide(10, 0)
        );
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

