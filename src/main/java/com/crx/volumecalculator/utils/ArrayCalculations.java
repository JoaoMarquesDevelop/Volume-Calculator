package com.crx.volumecalculator.utils;

import java.util.ArrayList;

public class ArrayCalculations {

    // Gets the higher value of an array of Integers

    public static int getMaxValueFromArray(Integer[] numbers){
        if (numbers.length == 0){
            return 0;
        }

        int max = numbers[0];

        for (int counter = 1; counter < numbers.length; counter++)
        {
            if (numbers[counter] > max)
            {
                max = numbers[counter];
            }
        }

        return max;
    }

    // In a given array of integers, and a given integer, gets an arraylist of integers
    // that contains the indexes of the given array that has a higher of equal value from the
    // given Integer.

    public static ArrayList<Integer> getAllIndexesThatHaveAHigherOrEqualValue(Integer[] numbers, int value){
        int index = 0;
        ArrayList<Integer> valuableIndexes = new ArrayList<>();

        for (int number: numbers){
            if (number >= value){
                valuableIndexes.add(index);
            }
            index++;
        }

        return valuableIndexes;
    }
}
