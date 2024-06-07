package com.mycompany.number5;

import java.util.Scanner;

public class InvestmentWhileLoop {
    public static void main(String[] args) {
        // Create a scanner object to read input from the console
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter the number of members
            System.out.print("Enter the number of members: ");
            int members = scanner.nextInt();
            
            // Create arrays to store principal amounts and future values for each member
            double[] principalAmounts = new double[members];
            double[] futureValues = new double[members];
            
            // Loop to input principal amounts for each member
            int i = 0;
            while (i < members) {
                System.out.print("Enter the principal amount for member " + (i + 1) + ": ");
                principalAmounts[i] = scanner.nextDouble();
                i++;
            }
            
            // Prompt the user to enter annual interest rate
            System.out.print("Enter the annual interest rate (in decimal, e.g., 0.05 for 5%): ");
            double rate = scanner.nextDouble();
            
            // Prompt the user to enter the time period in years
            System.out.print("Enter the time period in years: ");
            int time = scanner.nextInt();
            
            // Calculate future values for each member using the formula: FV = PV * (1 + r)^t
            i = 0;
            while (i < members) {
                futureValues[i] = principalAmounts[i] * Math.pow((1 + rate), time);
                // Display the future value for each member
                System.out.println("Future value for member " + (i + 1) + ": " + futureValues[i]);
                i++;
            }
        }
    }
}
