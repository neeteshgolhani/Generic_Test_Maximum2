package com.bridgelabz;
/*This  program that finds the maximum of three integers using the compareTo method
of the Integer class, taking user input for the three integers.

 The program defines a findMaxValue method that takes three Integer parameters,
 initializes the maximum to the first number, and compares the remaining two numbers
 to the current maximum, updating it if they are greater. Finally, it prints the maximum number.
 */
public class FindMaxValueUsingGeneric {
    public static void findMaxValue (Integer num1, Integer num2, Integer num3){
        // Initializing the maximum to the first number

        Integer max = num1;
        // Comparing second number with current maximum and updating if it is greater

        if (num2.compareTo(max)>0)
            // Comparing third number with current maximum and updating if it is greater

            max = num2;
        // Printing the maximum number

        if (num3.compareTo(max)>0)
            max = num3;

        System.out.println("Maximum of "+num1+", "+num2+", "+num3+" is "+max);
    }
}
