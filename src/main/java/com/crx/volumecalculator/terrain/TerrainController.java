package com.crx.volumecalculator.terrain;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

// Application Rest controller

@AllArgsConstructor
@RestController
@Api(tags = {"Terrain API"})
@RequestMapping("/terrain")
public class TerrainController {

    @Autowired
    private TerrainService terrainService;

    @ApiOperation("Adds a new terrain to the system")
    @PostMapping
    public ResponseEntity<TerrainDTO> addTerrain(@Valid @RequestBody CreateTerrainDTO createTerrainDTO) {
        return ResponseEntity.ok(terrainService.addTerrain(createTerrainDTO));
    }



}
