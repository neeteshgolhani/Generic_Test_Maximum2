package com.bridgelabz;
import java.util.Arrays;
/*In this implementation, the max method takes a variable number of arguments of type T,
which must implement the Comparable interface. The Arrays.sort method is used to sort the values in ascending order,
and the maximum value is returned, which is the last element in the sorted array.
The printMax method takes a single argument of type T, which represents the maximum value, and prints it to standard output.
In the main method, arrays of Integer, Float, and String objects are declared and initialized with values.
The max method is called with each array as an argument to find the maximum value,
which is then passed to the printMax method for printing to standard output.*/
// Define a public class named FindMaxValueUsingGenerics
public class FindMaxValueUsingGeneric {
    // Define a generic method `max` which takes a variable number of arguments of type T
    // and returns the maximum value among them
    public static <T extends Comparable<T>> T max(T... values) {
        // Sort the values in ascending order

        Arrays.sort(values);
        // Return the maximum value, which is the last element in the sorted array

        return values[values.length - 1];
    }
    public static <T extends Comparable<T>> void printMax(T max) {
        // Define a generic method `printMax` which takes a single argument of type T and prints it to standard output

        System.out.println("Max value: " + max);
    }
}
