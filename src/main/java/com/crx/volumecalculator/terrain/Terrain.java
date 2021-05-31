package com.crx.volumecalculator.terrain;

import lombok.*;

import java.util.ArrayList;

// Used only on Server side

@Getter
@Setter
@ToString
public class Terrain {

    private Integer[] data;
    private int waterVolume;

    public Terrain(Integer[] data){
        this.data = data;
        this.waterVolume = TerrainCalculationHelper.calculateWaterVolume(data);
    }
}
