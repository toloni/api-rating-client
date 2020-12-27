package br.com.toloni.apiratingclient.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class RateDto {

    @JsonProperty("id_rate")
    private UUID idRate;

    @JsonProperty("number_stars_rate")
    private Integer numberStarsRate;

    public RateDto() {
    }

    public RateDto(UUID idRate, Integer numberStarsRate) {
        this.idRate = idRate;
        this.numberStarsRate = numberStarsRate;
    }

    public UUID getIdRate() {
        return idRate;
    }

    public Integer getNumberStarsRate() {
        return numberStarsRate;
    }
}
