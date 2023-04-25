package com.bridgelabz;

import java.util.Scanner;

public class GenericMain {
     public static void main(String[] args) {
          //take tree integer from user
          Scanner input = new Scanner(System.in);
          System.out.print("Enter three float: ");
          float num1= input.nextInt();
          float num2= input.nextInt();
          float num3 = input.nextInt();
          // Calling the findMaxValue method with three number

          FindMaxValueUsingGeneric.findMaxValue(num1,num2,num3);
}
}
