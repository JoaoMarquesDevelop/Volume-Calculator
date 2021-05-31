package com.crx.volumecalculator.terrain;


import lombok.*;

import javax.validation.constraints.NotNull;

// data needed to create a new terrain

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateTerrainDTO {

    @NotNull
    private Integer[] data;
}
