package com.mycompany.number5;

import java.util.Scanner;

public class InvestmentForLoop {
    public static void main(String[] args) {
        // Creating a scanner object to read input from the console
        try (Scanner scanner = new Scanner(System.in)) {
            // Asking user to enter the number of members
            System.out.print("Enter the number of members: ");
            int members = scanner.nextInt();
            
            // Arrays to store principal amounts and future values for each member
            double[] principalAmounts = new double[members];
            double[] futureValues = new double[members];
            
            // Loop to get principal amounts for each member
            for (int i = 0; i < members; i++) {
                System.out.print("Enter the principal amount for member " + (i + 1) + ": ");
                principalAmounts[i] = scanner.nextDouble();
            }
            
            // Asking user to enter the annual interest rate
            System.out.print("Enter the annual interest rate (in decimal, e.g., 0.05 for 5%): ");
            double rate = scanner.nextDouble();
            
            // Asking user to enter the time period in years
            System.out.print("Enter the time period in years: ");
            int time = scanner.nextInt();
            
            // Calculating future values for each member and displaying them
            for (int i = 0; i < members; i++) {
                futureValues[i] = principalAmounts[i] * Math.pow((1 + rate), time);
                System.out.println("Future value for member " + (i + 1) + ": " + futureValues[i]);
            }
        }
    }
}
