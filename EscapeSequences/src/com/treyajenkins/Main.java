package com.treyajenkins;

// Created by Trey Jenkins on August 29, 2019
// Objective: To use a single println statement to write multiple lines

/**
 * This is simply a demonstration of “quote marks”.
 *      It also demonstrates the use of a tab character.
 *      Remember that the “\” has a special meaning in java.
 * This concludes this demonstration.
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("This is simply a demonstration of \"quote marks\"\n" + // Escapes the quote marks
                "\tIt also demonstrates the use of a tab character.\n" + // \t represents a tab
                "\tRemember that the \"\\\" has a special meaning in Java.\n" + // Escapes the quotes and the backslash
                "This concludes this demonstration.");

    }
}
