package com.ds.sorting;

public class SelectionSort {
    public static void main(String[] args){
        System.out.println("---Selection Sorting---");
        int[] numbers = {7, 2, 9, 0, 5};

        System.out.println("Unsorted Array is: ");
        for(int number: numbers){
            System.out.println(number);
        }

        for(int unsortedPartIndex = numbers.length - 1; unsortedPartIndex > 0; unsortedPartIndex--){

            int largestNumIndex = 0;
            for(int i = 1; i <= unsortedPartIndex; i++){
                if(numbers[i] > numbers[largestNumIndex]){
                    largestNumIndex = i;
                }
            }
            swap(numbers, largestNumIndex, unsortedPartIndex);
        }

        System.out.println("Sorted Array is: ");
        for(int number: numbers){
            System.out.println(number);
        }

    }

    public static void swap(int[] array, int i, int j){
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
