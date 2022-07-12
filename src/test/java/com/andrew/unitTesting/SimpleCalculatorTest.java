package com.andrew.unitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualFour() {
        var calculator = new SimpleCalculator();
        assertEquals(4, calculator.add(2,2));
        assertTrue(calculator.add(2,2) == 4);
    }

    @Test
    void twoPlusSevenShouldEqualNine() {
        var calculator = new SimpleCalculator();
        assertEquals(9, calculator.add(2,7));
        assertTrue(calculator.add(2,7) == 9);
    }
}