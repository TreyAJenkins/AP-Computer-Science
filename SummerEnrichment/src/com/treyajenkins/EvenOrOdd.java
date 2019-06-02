package com.treyajenkins;

import java.util.Scanner;

public class EvenOrOdd {
    public static String identity = "Lesson: if statement | Project: Even Or Odd";

    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int i = input.nextInt();
        System.out.println("The integer " + i + " is " + ( (i % 2 == 0) ? "even." : "odd." ));
    }
}
