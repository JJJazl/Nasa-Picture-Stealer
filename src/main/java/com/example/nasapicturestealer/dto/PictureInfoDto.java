package com.example.nasapicturestealer.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PictureInfoDto {
    private Long id;
    private Long nasaId;
    private String imgSrc;
    private LocalDate createdAt;
    private CameraInfoDto cameraInfoDto;

    public PictureInfoDto(Long id, Long nasaId, String imgSrc, LocalDate createdAt, Long cameraId, Long cameraNasaId, String cameraName) {
        this.id = id;
        this.nasaId = nasaId;
        this.imgSrc = imgSrc;
        this.createdAt = createdAt;
        this.cameraInfoDto = new CameraInfoDto(cameraId, cameraNasaId, cameraName);
    }
}
