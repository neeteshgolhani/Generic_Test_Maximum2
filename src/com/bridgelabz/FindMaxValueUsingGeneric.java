package com.bridgelabz;
import java.util.Arrays;
import java.util.Optional;
import java.util.Comparator;

// Define a public class named FindMaxValueUsingGenerics
public class FindMaxValueUsingGeneric {

    // Define a static method to find the maximum value among three Integers
    public static void findMaxValue(Integer num1, Integer num2, Integer num3) {
        // Initialize max to be the first number
        Integer max = num1;
        // Check if the second number is greater than max, if so update max
        if (num2.compareTo(max) > 0)
            max = num2;
        // Check if the third number is greater than max, if so update max
        if (num3.compareTo(max) > 0)
            max = num3;
        // Print the maximum value found
        System.out.println("Maximum of " + num1 + ", " + num2 + ", " + num3 + " is " + max);
    }

    // Define a static method to find the maximum value among three Floats
    public static void findMaxValue(Float num1, Float num2, Float num3) {
        // Initialize max to be the first number
        Float max = num1;
        // Check if the second number is greater than max, if so update max
        if (num2.compareTo(max) > 0)
            max = num2;
        // Check if the third number is greater than max, if so update max
        if (num3.compareTo(max) > 0)
            max = num3;
        // Print the maximum value found
        System.out.println("Maximum of " + num1 + ", " + num2 + ", " + num3 + " is " + max);
    }

    // Define a static method to find the maximum value among three Strings
    public static void findMaxValue(String str1, String str2, String str3) {
        // Initialize max to be the first string
        String max = str1;
        // Check if the second string comes after max lexicographically, if so update max
        if (str2.compareTo(max) > 0)
            max = str2;
        // Check if the third string comes after max lexicographically, if so update max
        if (str3.compareTo(max) > 0)
            max = str3;
        // Print the maximum value found
        System.out.println("Maximum of " + str1 + ", " + str2 + ", " + str3 + " is " + max);
    }

    public static <T extends Comparable<T>> Optional<T> findMaxValue(T... values) {
        // Sort the values array in descending order using a custom comparator
        Arrays.sort(values, Comparator.reverseOrder());

        // Return the first value in the sorted array as an Optional
        return values.length > 0 ? Optional.of(values[0]) : Optional.empty();
    }
}