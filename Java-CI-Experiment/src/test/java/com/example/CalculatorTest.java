package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(8, calculator.add(3, 5));
    }

    @Test
    void subtractsTwoNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(4, calculator.subtract(9, 5));
    }

    @Test
    void multipliesTwoNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(42, calculator.multiply(6, 7));
    }
}
