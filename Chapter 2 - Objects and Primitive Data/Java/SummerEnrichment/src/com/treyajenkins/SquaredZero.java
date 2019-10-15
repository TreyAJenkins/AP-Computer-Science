package com.treyajenkins;

import java.util.Scanner;

public class SquaredZero {
    public static String identity = "Lesson: while and do-while loops | Project: #14 on page 12 – 4";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int in = 0;

        do {
            System.out.print("Enter a number: ");
            in = input.nextInt();
            System.out.println(in + "^2 = " + Math.pow(in, 2));
        } while (in != 0);
    }
}
