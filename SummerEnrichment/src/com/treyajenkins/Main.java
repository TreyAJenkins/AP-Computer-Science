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
                default: {
                    System.out.println("Invalid option");
                }
            }
            System.out.println("\n");
        }

    }
}
