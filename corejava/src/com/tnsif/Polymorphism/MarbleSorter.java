package com.tnsif.Polymorphism;

import java.util.Scanner;

public class MarbleSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarbles = 10;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the color of the marble being picked: ");
            String color = scanner.nextLine().trim().toLowerCase();

            if (color.equals("blue") || color.equals("red")) {
                totalMarbles--;
            }

            System.out.println("Number of marbles remaining: " + totalMarbles);
        }
    }
}
