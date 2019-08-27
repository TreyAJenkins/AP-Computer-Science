// Trey Jenkins 8/26/2019

package com.treyajenkins;

import java.text.DecimalFormat;

public class Main {

    static double initialBalance = 1000.00;
    static double interestRate = 0.05;
    static int years = 3;

    public static void main(String[] args) {
        for (int year = 1; year <= years; year++) {
            DecimalFormat df = new DecimalFormat("0.00"); // Format balance to two decimal places
            // Prints and calculates interest
            System.out.println("Balance after year " + year + " = $" + df.format(initialBalance * Math.pow(1+interestRate, year)));
        }
    }
}
