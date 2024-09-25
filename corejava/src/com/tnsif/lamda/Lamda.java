package com.tnsif.lamda;



import java.util.Scanner;
import java.util.function.IntUnaryOperator;

public class Lamda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

  
        System.out.println("Enter a number to find the factorial:");
        int num = scan.nextInt(); 
        
        IntUnaryOperator factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println("Factorial of " + num + " is " + factorial.applyAsInt(num));
    }
}
