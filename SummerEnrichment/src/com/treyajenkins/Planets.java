package com.treyajenkins;

import java.util.Scanner;

public class Planets {
    public static String identity = "Lesson: switch statement and char | Project: Weight on Other Planets";

    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your weight on Earth? ");
        float weight = input.nextFloat();
        System.out.print("1. Voltar\n2. Krypton\n3. Fertos\n4. Servontos\n\nSelection? ");
        switch (input.nextInt()) {
            case 1: {
                //Voltar
                System.out.println("Your weight on Voltar would be " + (weight * 0.091));
                break;
            }
            case 2: {
                //Krypton
                System.out.println("Your weight on Krypton would be " + (weight * 0.720));
                break;
            }
            case 3: {
                //Fertos
                System.out.println("Your weight on Fertos would be " + (weight * 0.865));
                break;
            }
            case 4: {
                //Servontos
                System.out.println("Your weight on Servontos would be " + (weight * 4.612));
                break;
            }
            default: {
                System.out.println("Invalid selection");
            }
        }
    }
}
