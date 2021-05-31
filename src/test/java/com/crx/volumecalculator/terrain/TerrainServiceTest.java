package com.crx.volumecalculator.terrain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TerrainServiceTest {

    @Autowired
    TerrainService terrainService;

    // test using the document parameters

    @Test
    void addTerrain() {
        Integer[] test1 = {3,2,4,1,2};

        assertEquals(2,getVolumeFromTerrain(test1));

        Integer[] test2 = {4,1,1,0,2,3};

        assertEquals(8,getVolumeFromTerrain(test2));
    }

    private int getVolumeFromTerrain(Integer[] terrainHeights){
        CreateTerrainDTO testTerrain = new CreateTerrainDTO(terrainHeights);

        TerrainDTO terrainDTO = terrainService.addTerrain(testTerrain);

        return terrainDTO.getWaterVolume();
    }

}