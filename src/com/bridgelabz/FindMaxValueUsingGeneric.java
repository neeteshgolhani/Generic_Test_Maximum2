package com.bridgelabz;
/* Sure! Here's a refactored version of the code to create a generic class that
takes in three variables of generic type and ensures that the generic type extends Comparable.
I've also added a parameter constructor and a testMaximum method to internally call the
static findMaxValue method and return the maximum value of the three variables.
 */
    // This method takes in three values of type T (which must be comparable),
    // and returns the maximum value of the three.
    public class FindMaxValueUsingGeneric<T extends Comparable<T>> {
        private T a1;
        private T a2;
        private T a3;

        // Parameter constructor to initialize the three variables
        public FindMaxValueUsingGeneric(T a1, T a2, T a3) {
            this.a1 = a1;
            this.a2 = a2;
            this.a3 = a3;
        }

        // Method to find the maximum value of the three variables
        public T testMaximum() {
            return FindMaxValueUsingGeneric.findMaxValue(a1, a2, a3);
        }

        // Static method to find the maximum value of three generic variables
        public static <T extends Comparable<T>> T findMaxValue(T a1, T a2, T a3) {
            T max = a1;
            if (a2.compareTo(max) > 0)
                max = a2;
            if (a3.compareTo(max) > 0)
                max = a3;
            return max;
        }
    }