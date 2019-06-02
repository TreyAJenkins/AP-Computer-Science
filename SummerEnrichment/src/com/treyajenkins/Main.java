package com.treyajenkins;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean running = true;

        while (running) {

            System.out.println("Select a lesson:");
            System.out.println("1 ) " + HelloWorld.identity);

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

                default: {
                    System.out.println("Invalid option");
                }
            }
            System.out.println("\n");
        }

    }
}
