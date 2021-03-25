package com.ds.sorting;

public class InsertionSort {
    public static void main(String[] args){
        System.out.println("---Insertion Sorting---");
        int[] numbers = {7, 2, 9, 0, 5};

        System.out.println("Unsorted Array is: ");
        for(int number: numbers){
            System.out.println(number);
        }

        for(int unsortedPartIndex = 1; unsortedPartIndex < numbers.length; unsortedPartIndex++){
            int newElement = numbers[unsortedPartIndex];
            int i;

            for(i = unsortedPartIndex; i > 0 && numbers[i-1] > newElement; i--){
                numbers[i] = numbers[i-1];
            }
            numbers[i] = newElement;
        }

        System.out.println("Sorted Array is: ");
        for(int number: numbers){
            System.out.println(number);
        }
    }
}
