package com.example.nasapicturestealer.mapper;

import com.example.nasapicturestealer.dto.NasaPictureInfoDto;
import com.example.nasapicturestealer.entity.Picture;
import org.springframework.stereotype.Component;

@Component
public class NasaPictureInfoDtoToPictureMapper {

    public Picture toPicture(NasaPictureInfoDto nasaPictureInfoDto) {
        Picture picture = new Picture();
        picture.setNasaId(nasaPictureInfoDto.getId());
        picture.setImgSrc(nasaPictureInfoDto.getImgSrc());
        picture.setCreatedAt(nasaPictureInfoDto.getCreatedAt());
        return picture;
    }
}
