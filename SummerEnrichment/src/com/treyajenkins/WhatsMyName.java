package com.treyajenkins;

import java.util.Scanner;

public class WhatsMyName {
    public static String identity = "Lesson: Input from the Keyboard | Project: What's My Name?";

    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your first name? ");
        String first = input.nextLine();
        System.out.print("What is your last name? ");
        String last = input.nextLine();
        System.out.println("Your full name is " + first + " " + last + ".");
    }
}
