package com.example.nasapicturestealer.mapper;

import com.example.nasapicturestealer.dto.NasaCameraInfoDto;
import com.example.nasapicturestealer.entity.Camera;
import org.springframework.stereotype.Component;

@Component
public class NasaCameraInfoDtoToCameraMapper {

    public Camera toCamera(NasaCameraInfoDto nasaCameraInfoDto) {
        Camera camera = new Camera();
        camera.setNasaId(nasaCameraInfoDto.getId());
        camera.setName(nasaCameraInfoDto.getName());
        return camera;
    }
}
