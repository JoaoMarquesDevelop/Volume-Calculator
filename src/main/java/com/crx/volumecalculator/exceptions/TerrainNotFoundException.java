package com.crx.volumecalculator.exceptions;

public class TerrainNotFoundException extends RuntimeException{
    public TerrainNotFoundException(){
        super("Terrain not found");
    }

}
