package com.tnisf.testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FactorialAssert {

    @Test
    @DisplayName("Factorial Equality Test")
    public void factorialEqualityTest() {
        int expected = 120;  // Expected value
        int actual = NumberFunctions.getFactorial(5);  // Method call to get the factorial of 5
        assertEquals(expected, actual, "The factorial of 5 should be 120.");  // Equality assertion
        assertNotEquals(100, actual, "The factorial of 5 should not be 100.");  // Non-equality assertion
    }

    @Test
    @DisplayName("Factorial Truth Test")
    public void factorialTruthTest() {
        int actual = NumberFunctions.getFactorial(5);  // Method call to get the factorial of 5
        assertTrue(actual == 120, "The factorial of 5 should be true for 120.");  // Truth assertion
        assertFalse(actual == 100, "The factorial of 5 should be false for 100.");  // False assertion
    }

    @Test
    @DisplayName("Factorial Null Test")
    public void factorialNullTest() {
        Integer result = NumberFunctions.getFactorial(0);  // Method call to get the factorial of 0
        assertNotNull(result, "The result should not be null.");  // Not-null assertion

        Integer nullResult = null;
        assertNull(nullResult, "This result is null.");  // Null assertion
    }

    @Test
    @DisplayName("Factorial Identity Test")
    public void factorialIdentityTest() {
        Integer expected = 120;  // Expected value
        Integer actual = NumberFunctions.getFactorial(5);  // Method call to get the factorial of 5
        assertSame(expected, actual, "The references should point to the same object for factorial of 5.");  // Identity assertion
        
        Integer unexpected = NumberFunctions.getFactorial(4);  // Method call to get the factorial of 4
        assertNotSame(expected, unexpected, "The references should not point to the same object.");  // Not-same assertion
    }
}
