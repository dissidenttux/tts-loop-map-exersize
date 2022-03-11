package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        /*
        1. Write a program that does the following:
            - Asks the user for 5 numbers
            - Stores them in an array list
            - Finds the sum, product, largest, and smallest of those numbers
        */

        /* Ask the user for five numbers */
        System.out.println("Please enter five numbers:");
        // Have computer scan numbers from the user
        Scanner input = new Scanner(System.in);
        // ArrayList to store numbers in
        ArrayList<Integer> num = new ArrayList<Integer>();
        // Adding numbers to ArrayList from user input
        int num1 = input.nextInt();
        num.add(num1);
        input.nextLine();
        int num2 = input.nextInt();
        num.add(num2);
        input.nextLine();
        int num3 = input.nextInt();
        num.add(num3);
        input.nextLine();
        int num4 = input.nextInt();
        num.add(num4);
        input.nextLine();
        int num5 = input.nextInt();
        num.add(num5);
        input.nextLine();

        /* Store the numbers in an ArrayList */


        /* Find the sum, product, largest, and smallest of those numbers */

        // Sum
        System.out.println("Here is the sum of the numbers you input: ");
        // initialize sum of num array
        int numSum = 0;
        // looping through each item of ArrayList, "num", the items represented by valueInNum
        for(Integer valueInNum : num) {
            // adding each valueInNum to one sum
            numSum += valueInNum;
        }
        System.out.println(numSum);

        // Product
        System.out.println("Here is the product of the numbers you input: ");
        // initialize product of num array
        int numProduct = 1;
        for(Integer valueInNum : num) {
            numProduct *= valueInNum;
        }
        System.out.println(numProduct);

        // Largest
        System.out.println("Here is the largest of the numbers you input: ");
        // Used the "max" function from the Collections utility on the num array to find the max
        Integer numLargest = Collections.max(num);
        System.out.println(numLargest);

        // Smallest
        System.out.println("Here is the product of the numbers you input: ");
        // Used the "min" function from the Collections utility on the num array to find the min
        Integer numSmallest = Collections.min(num);
        System.out.println(numSmallest);
    }
}
