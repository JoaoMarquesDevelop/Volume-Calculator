package com.crx.volumecalculator.terrain;

import lombok.*;

// Terrain to transfer to the user

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TerrainDTO {

    private Integer[] data;

    private int waterVolume;
}
