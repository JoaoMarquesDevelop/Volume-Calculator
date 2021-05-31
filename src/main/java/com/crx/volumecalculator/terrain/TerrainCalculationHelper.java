package com.crx.volumecalculator.terrain;

import com.crx.volumecalculator.utils.ArrayCalculations;

import java.util.ArrayList;

public class TerrainCalculationHelper {

    // Calculating horizontally from up to bottom

    public static int calculateWaterVolume(Integer[] data){

        int maxHeight = ArrayCalculations.getMaxValueFromArray(data);
        int currentVolume = 0;

        for (int currentCalculationHeight = maxHeight; currentCalculationHeight > 0; currentCalculationHeight--)
        {
            // Here we get all the indexes that are higher or equal to the "currentCalculationHeight"
            ArrayList<Integer> importantIndexes = ArrayCalculations.getAllIndexesThatHaveAHigherOrEqualValue(data,currentCalculationHeight);

            // Add a new "horizontal slice" to the volume
            currentVolume += calculateVolumeInTheCurrentSlice(importantIndexes);
        }

        return currentVolume;
    }

    // Counting horizontally
    // Adding up the number of empty spaces between the selected indexes (forming the "fragmented slice of water")

    private static int calculateVolumeInTheCurrentSlice(ArrayList<Integer> indexes){
        int volumeInTheCurrentSlice = 0;

        for (int i = 0; i < indexes.size() - 1; i++) {
            int currentIndex = indexes.get(i);
            int nextIndex = indexes.get(i+1);

            if (nextIndex != currentIndex + 1){
                volumeInTheCurrentSlice += nextIndex - currentIndex - 1;
            }
        }

        return volumeInTheCurrentSlice;
    }


}
