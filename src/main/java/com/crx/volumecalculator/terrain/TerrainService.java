package com.crx.volumecalculator.terrain;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TerrainService {

    @Autowired
    private final TerrainMapper terrainMapper;

    public TerrainDTO addTerrain(CreateTerrainDTO createTerrainDTO) {
        return terrainMapper.map(terrainMapper.map(createTerrainDTO));
    }
}
