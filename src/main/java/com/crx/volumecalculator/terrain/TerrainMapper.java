package com.crx.volumecalculator.terrain;

import org.springframework.stereotype.Component;

@Component
public class TerrainMapper {

    public TerrainDTO map(Terrain source){
        if ( source == null ) {
            return null;
        }
        TerrainDTO terrainDTO= new TerrainDTO();

        terrainDTO.setData(source.getData());
        terrainDTO.setWaterVolume(source.getWaterVolume());

        return terrainDTO;
    }

    public Terrain map(CreateTerrainDTO source){
        if ( source == null ) {
            return null;
        }

        return new Terrain(source.getData());
    }
}
