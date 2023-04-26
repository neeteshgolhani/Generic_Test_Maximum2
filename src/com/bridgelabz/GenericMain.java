package com.bridgelabz;
import static com.bridgelabz.FindMaxValueUsingGeneric.findMaxValue;
/*In this code, the findMaxValue method is being called with different types
 of inputs (integers, floats, and strings), but it works for all of them because it uses generics.
  The <T extends Comparable<T>> syntax allows the method to work with any
  type T that implements the Comparable interface, which includes all of these types.
   The System.out.println statements
 print out the maximum value returned by the findMaxValue method for each input type.
* */
public class GenericMain {
     public static void main(String[] args) {
     // Print out a welcome message.
        System.out.println("Welcome to Find Maximum Problem Using Generics.");

     // Call findMaxValue with three integer inputs and print out the maximum value.
        System.out.println("The maximum value between the three Integers is : "+findMaxValue(20, 12, 15));

     // Call findMaxValue with three float inputs and print out the maximum value.
        System.out.println("The maximum value between the three Floats is : "+findMaxValue(20.3f, 22.1f, 15.9f));

     // Call findMaxValue with three string inputs and print out the maximum value.
        System.out.println("The maximum value between the three Strings is : "+findMaxValue("Apple", "Peach", "Banana"));
}
}