package com.bridgelabz;
import static com.bridgelabz.FindMaxValueUsingGeneric.*;

// Define the main method to run the program
public class GenericMain {
        public static void main(String[] args) {
                // Declare and initialize arrays of Integer, Float, and String objects

                Integer[] integers = {20, 12, 15, 50, 45};
                Float[] floats = {20.3f, 22.1f, 15.9f, 18.2f};
                String[] strings = {"apple", "banana", "peach", "pear"};
                // Find the maximum value in each array using the `max` method and store it in a variable

                Integer maxInteger = max(integers);
                Float maxFloat = max(floats);
                String maxString = max(strings);
                // Print each maximum value to standard output using the `printMax` method

                printMax(maxInteger);
                printMax(maxFloat);
                printMax(maxString);
        }
}