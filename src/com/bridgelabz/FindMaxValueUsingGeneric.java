package com.bridgelabz;
/*The key point to note here is that the <T extends Comparable<T>> syntax specifies
 that the method only works with types T that implement the Comparable interface.
 This is necessary because we use the compareTo method to compare values within the method.
 */
public class FindMaxValueUsingGeneric {
    // This method takes in three values of type T (which must be comparable),
    // and returns the maximum value of the three.
    public static <T extends Comparable<T>> T findMaxValue(T a1, T a2, T a3){
        // Start by assuming that a1 is the max.
        T max = a1;
        // Check if a2 is greater than the current max.
        if (a2.compareTo(max) > 0)
            max = a2;
        // Check if a3 is greater than the current max.
        if (a3.compareTo(max) > 0)
            max = a3;
        // Return the maximum value.
        return max;
    }
}