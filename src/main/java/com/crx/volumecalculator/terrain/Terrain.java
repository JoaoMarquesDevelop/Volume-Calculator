package com.crx.volumecalculator.terrain;

import lombok.*;

// Used only on Server side

@Getter
@Setter
@ToString
public class Terrain {

    private Integer[] data;
    private int waterVolume;

    public Terrain(Integer[] data){
        this.data = data;
        this.waterVolume = calculateWaterVolume(data);
    }

    private int calculateWaterVolume(Integer[] data){
        return data.length;
    }
}
