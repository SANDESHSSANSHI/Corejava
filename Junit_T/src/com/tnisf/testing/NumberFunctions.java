package com.tnisf.testing;

public class NumberFunctions {
    public static int getFactorial(int n) {
        if (n < 0) {
            System.out.print("Factorial is not defined for negative numbers.");
        }
        return n <= 1 ? 1 : n * getFactorial(n - 1);
    }
}
