package com.tnsif.Polymorphism;

import java.util.Scanner;

public class SmartMaskSales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalOrders = 0;
        int orderQuantity = 100;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the pincode for hospital " + (i + 1) + ": ");
            int pincode = scanner.nextInt();
            if (pincode % 2 == 0) {
                totalOrders += orderQuantity;
            }
        }

        System.out.println("Total orders placed for the smart mask: " + totalOrders);
        
    }
}
