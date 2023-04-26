package com.bridgelabz;

import java.util.Optional;

import static com.bridgelabz.FindMaxValueUsingGeneric.findMaxValue;

// Define the main method to run the program
public class GenericMain {
        public static void main(String[] args) {
                // Call the findMaxValue method for Integers
                findMaxValue(20, 12, 15);
                // Call the findMaxValue method for Floats
                findMaxValue(20.3f, 22.1f, 15.9f);
                // Call the findMaxValue method for Strings
                findMaxValue("Apple", "Peach", "Banana");
                // Call the findMaxValue method with various types and numbers of parameters
                Optional<Integer> maxInt = findMaxValue(20, 12, 15, 28, 19);
                Optional<Float> maxFloat = findMaxValue(20.3f, 22.1f, 15.9f, 23.4f);
                Optional<String> maxString = findMaxValue("Apple", "Peach", "Banana", "Orange", "Grape");

                // Print the results
                System.out.println("The maximum integer is: " + maxInt.orElse(null));
                System.out.println("The maximum float is: " + maxFloat.orElse(null));
                System.out.println("The maximum string is: " + maxString.orElse(null));
        }
}