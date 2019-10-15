package com.treyajenkins;

import java.util.Scanner;

public class GoingInCircles {
    public static String identity = "Lesson: Input from the Keyboard | Project: Going In Circles";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the area? ");
        double area = input.nextDouble();
        System.out.println("The radius of your circle is " + Math.sqrt(area/Math.PI) + ".");

    }
}
