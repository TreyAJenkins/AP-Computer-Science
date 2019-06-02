package com.treyajenkins;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean running = true;

        while (running) {

            System.out.println("Select a lesson:");
            System.out.println("1 ) " + HelloWorld.identity);
            System.out.println("2 ) " + NameThatCelebrity.identity);
            System.out.println("3 ) " + ArithmeticAssignment.identity);
            System.out.println("4 ) " + MixedResults.identity);
            System.out.println("5 ) " + ComputeThis.identity);
            System.out.println("6 ) " + GoingInCircles.identity);
            System.out.println("7 ) " + WhatsMyName.identity);
            System.out.println("8 ) " + EvenOrOdd.identity);
            System.out.println("9 ) " + Planets.identity);

            System.out.print("0 ) Exit\n\n[#]> ");

            switch (input.nextInt()) {
                case 0: {
                    System.out.println("Exiting...");
                    running = false;
                    break;
                }
                case 1: {
                    // Hello World
                    System.out.println(HelloWorld.identity + "\n");
                    HelloWorld.main();
                    break;
                }
                case 2: {
                    // Name That Celebrity
                    System.out.println(NameThatCelebrity.identity);
                    NameThatCelebrity.main();
                    break;
                }
                case 3: {
                    // Arithmetic Assignment
                    System.out.println(ArithmeticAssignment.identity);
                    ArithmeticAssignment.main();
                    break;
                }
                case 4: {
                    // Mixed Results
                    System.out.println(MixedResults.identity);
                    MixedResults.main();
                    break;
                }
                case 5: {
                    // Compute This
                    System.out.println(ComputeThis.identity);
                    ComputeThis.main();
                    break;
                }
                case 6: {
                    // Going In Circles
                    System.out.println(GoingInCircles.identity);
                    GoingInCircles.main();
                    break;
                }
                case 7: {
                    // What's My Name?
                    System.out.println(WhatsMyName.identity);
                    WhatsMyName.main();
                    break;
                }
                case 8: {
                    // Even or Odd?
                    System.out.println(EvenOrOdd.identity);
                    EvenOrOdd.main();
                    break;
                }
                case 9: {
                    // Weight on Other Planets
                    System.out.println(Planets.identity);
                    Planets.main();
                    break;
                }
                default: {
                    System.out.println("Invalid option");
                }
            }
            System.out.println("\n");
        }

    }
}
