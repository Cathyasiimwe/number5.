package com.mycompany.number5;

import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        // Create a scanner object to read input from the console
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter the first number
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            
            // Prompt the user to enter the second number
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            
            // Prompt the user to enter the third number
            System.out.print("Enter the third number: ");
            int num3 = scanner.nextInt();
            
            // Calculate the product of the three numbers
            int product = num1 * num2 * num3;
            // Calculate the sum of the three numbers
            int sum = num1 + num2 + num3;
            // Find the maximum of the three numbers
            int max = Math.max(num1, Math.max(num2, num3));
            
            // Display the results in a formatted table
            System.out.printf("%-10s %-10s %-10s%n", "Product", "Sum", "Maximum");
            System.out.printf("%-10d %-10d %-10d%n", product, sum, max);
        }
    }
}
