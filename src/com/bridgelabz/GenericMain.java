package com.bridgelabz;
import static com.bridgelabz.FindMaxValueUsingGeneric.findMaxValue;
/*In this example, the FindMaxValueUsingGeneric class is being used to find
the maximum value of three generic variables (integers, floats, and strings).
The testMaximum method is called on each instance of the class, which internally
calls the findMaxValue static method and returns the maximum value. The System.out.println statements
 print out the maximum value returned by the testMaximum method for each input type.
* */
public class GenericMain {
    public static void main(String[] args) {
        // Create a new instance of the FindMaxValueUsingGeneric class with integer inputs
        FindMaxValueUsingGeneric<Integer> integerMax = new FindMaxValueUsingGeneric<>(20, 12, 15);
        // Call the testMaximum method and print out the maximum value
        System.out.println("The maximum value between the three Integers is : " + integerMax.testMaximum());

        // Create a new instance of the FindMaxValueUsingGeneric class with float inputs
        FindMaxValueUsingGeneric<Float> floatMax = new FindMaxValueUsingGeneric<>(20.3f, 22.1f, 15.9f);
        // Call the testMaximum method and print out the maximum value
        System.out.println("The maximum value between the three Floats is : " + floatMax.testMaximum());

        // Create a new instance of the FindMaxValueUsingGeneric class with string inputs
        FindMaxValueUsingGeneric<String> stringMax = new FindMaxValueUsingGeneric<>("Apple", "Peach", "Banana");
        // Call the testMaximum method and print out the maximum value
        System.out.println("The maximum value between the three Strings is : " + stringMax.testMaximum());
    }
}