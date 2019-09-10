package com.treyajenkins;

/**
 * Created by Trey Jenkins on August 27, 2019
 * Puts name in a box
 */

public class Main {

    //Define the name
    static String nombre = "Trey Jenkins";

    public static void main(String[] args) {
        // Width is wide enough for the name, and two chars on either side
	    int width = nombre.length() + 4;
	    System.out.print("*"); // Asterisk
	    for (int x = 1; x < width-1; x++) { // Dashing through the screen
	        System.out.print("-"); // Dash
        }
        System.out.println("*"); // Asterisk y Newline
	    System.out.println("| " + nombre + " |"); // Print out the name with whitespace and a border
        System.out.print("*"); // Asterisk
        for (int x = 1; x < width-1; x++) { // Dash, Dash, Revolution
            System.out.print("-"); // Dash
        }
        System.out.println("*"); // Asterisk y Newline
    }
}
