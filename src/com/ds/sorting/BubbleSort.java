package com.ds.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("---Bubble Sorting---");
        int[] numbers = {7, 2, 9, 0, 5};

        System.out.println("Unsorted Array is: ");
        for(int i=0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        for(int unsortedPartIndex= numbers.length-1; unsortedPartIndex>0; unsortedPartIndex--){
            for(int i= 0; i<unsortedPartIndex; i++){
                if(numbers[i] > numbers[i+1]){
                    //call swap method
                    swap(numbers, i, i+1);
                }
            }
        }

        System.out.println("Sorted Array is: ");
        for(int i=0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }


    }

    public static void swap(int[] array, int i, int j){
        if(i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
