package com.example.nasapicturestealer.repository;

import com.example.nasapicturestealer.dto.PictureInfoDto;
import com.example.nasapicturestealer.entity.Picture;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PictureRepository extends JpaRepository<Picture, Long> {

    @Query("select new com.example.nasapicturestealer.dto.PictureInfoDto(p.id, p.nasaId, p.imgSrc, p.createdAt, c.id, c.nasaId, c.name) from Picture p join p.camera c")
    Page<PictureInfoDto> getAllStolenPictures(Pageable pageable);
}
