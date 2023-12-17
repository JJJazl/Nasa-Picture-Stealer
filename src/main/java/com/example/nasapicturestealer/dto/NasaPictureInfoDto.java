package com.example.nasapicturestealer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class NasaPictureInfoDto {

    private Long id;

    @JsonProperty("img_src")
    private String imgSrc;

    @JsonProperty("earth_date")
    private LocalDate createdAt;

    private NasaCameraInfoDto camera;
}
