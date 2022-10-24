package com.kyrn.algorithms;

public class BinarySearch {

    public static Integer search(int[] givenArr, int givenElement) {
        int lowestIndex = 0;
        int highestIndex = givenArr.length - 1;
        int midIndex;
        int iteration = 0;
        while (lowestIndex <= highestIndex) {
            System.out.println(++iteration + " . iteration");
            midIndex = (lowestIndex + highestIndex) / 2;
            if (givenArr[midIndex] == givenElement) {
                return givenArr[midIndex];
            } else if (givenArr[midIndex] > givenElement) {
                highestIndex = midIndex - 1;
            } else {
                lowestIndex = midIndex + 1;
            }
        }
        return null;
    }
}
