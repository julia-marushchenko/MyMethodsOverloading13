/**
 *   Java program to demonstrate compile polymorphism.
 */

package com.mymethods;

/**
 * Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Calling static methods of Main.
        Main.method(5, 8);
        Main.method("Hello", "World");
        Main.method("Hello", 2.0);
        System.out.println(Main.method(2.5, 7.9));

    }

    // Method with 2 numeric arguments.
    public static void method(int number, int number1) {

        System.out.println("Method with numeric arguments");

    }

    // Method with 2 string arguments.
    public static void method(String line, String line1) {

        System.out.println("Method with string arguments");

    }

    // Method with one  string and one numeric arguments.
    public static void method(String line, double number1) {

        System.out.println("Method with one  string and one numeric arguments");

    }

    // Method with one  string and one numeric arguments.
    public static double method(double number, double number1) {

        System.out.println("Method with one  string and one numeric arguments");

        return number + number1;

    }

}
