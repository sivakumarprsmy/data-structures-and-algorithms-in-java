/*
Array operations
 */
package com.ds;

public class TimeComplexityOfArray {

    public static void main(String[] args) {

        int[] intArray = new int[5];
        intArray[0] = 1;
        intArray[1] = 4;
        intArray[2] = 5;
        intArray[3] = 10;
        intArray[4] = 12;

        // When we know the index of the element we are looking for, Time complexity is O(1)
        System.out.println("Value at index 2 is "+intArray[2]);

        // Other wise, Time complexity is O(n)
        for(int number: intArray){
            System.out.println(number);
        }


        int[] intArrayCopy = new int[1];
        System.out.println("ArrayCopy length is "+ intArrayCopy.length);

        // The below statement changes the size of the intArrayCopy as per intArray
        intArrayCopy = intArray;
        for(int number: intArrayCopy){
            System.out.println(number);
        }
        System.out.println("ArrayCopy length is.. "+ intArrayCopy.length);
    }
}
