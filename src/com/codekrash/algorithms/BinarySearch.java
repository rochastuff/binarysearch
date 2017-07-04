package com.codekrash.algorithms;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {14, 3, 65, 15, 85, 90, 56, 87, 25, 62, 11, 1, 71, 6, 24, 43, 50, 16, 27, 8, 90 ,12};
        int numberToFind = 24;

        System.out.println("Original array: ");
        for(int number : array) {
            System.out.print(number + "\t");
        }

        Arrays.sort(array);
        System.out.println("\n\nSorted array: ");
        for(int number : array) {
            System.out.print(number + "\t");
        }

        System.out.println("\n\nLet's find number " + numberToFind + "!");

        int start = 0;
        int end = array.length - 1;
        int index = -1;
        int stepsCount = 0;

        while(end >= start) {

            stepsCount++;
            int middle = (start + end) / 2;

            if(array[middle] == numberToFind) {
                index = middle;
                break;

            } else if(array[middle] < numberToFind) {
                start = middle + 1;

            } else if(array[middle] > numberToFind) {
                end = middle - 1;
            }
        }

        if(index > -1) {
            System.out.println("Number found at index: " + index);
        }
        else {
            System.out.println("Sorry the number was not found :(");
        }

        System.out.println("Steps count: " + stepsCount);

    }
}
