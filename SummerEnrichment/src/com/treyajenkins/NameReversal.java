package com.treyajenkins;

import java.util.Scanner;

public class NameReversal {
    public static String identity = "Lesson: for loop | Project: Name Reversal";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name. ");
        String name = input.nextLine().toLowerCase();

        for (int i = name.length(); i > 0; i--) {
            System.out.print(name.substring(i-1, i));
        }
        System.out.println();
    }
}
