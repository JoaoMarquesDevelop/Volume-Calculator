package com.crx.volumecalculator.terrain;

import lombok.*;

// Used only on Server side

@Getter
@ToString
public class Terrain {

    private final Integer[] data;
    private final int waterVolume;

    public Terrain(Integer[] data){
        this.data = data;
        this.waterVolume = TerrainCalculationHelper.calculateWaterVolume(data);
    }
}
