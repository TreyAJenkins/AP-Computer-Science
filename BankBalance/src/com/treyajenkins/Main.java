package com.treyajenkins;

public class Main {

    double initialBalance = 1000.00;
    double interestRate = 0.05;
    static int years = 3;

    public static void main(String[] args) {
        for (int i = 1; i <= years; i++) {

            System.out.println("Balance after year " + String.valueOf(i) + " = $");
        }
    }
}
