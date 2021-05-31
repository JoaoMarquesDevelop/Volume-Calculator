package com.crx.volumecalculator.terrain;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

// Application Rest controller

@AllArgsConstructor
@RestController
@RequestMapping("/terrain")
public class TerrainController {

    @Autowired
    private TerrainService terrainService;

    @PostMapping
    public ResponseEntity<TerrainDTO> addTerrain(@Valid @RequestBody CreateTerrainDTO createTerrainDTO) {
        return ResponseEntity.ok(terrainService.addTerrain(createTerrainDTO));
    }



}
