package org.example.testingclass;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddMethod() {

        Calculator calculator = new Calculator();
        assertEquals(11, calculator.add(5, 6));
    }
}