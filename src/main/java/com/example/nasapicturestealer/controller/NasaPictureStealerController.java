package com.example.nasapicturestealer.controller;

import com.example.nasapicturestealer.dto.PictureInfoDto;
import com.example.nasapicturestealer.dto.StealNasaPicturesRequestInfoDto;
import com.example.nasapicturestealer.service.NasaPictureService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nasa/pictures")
@RequiredArgsConstructor
public class NasaPictureStealerController {

    private final NasaPictureService nasaPictureService;

    @PostMapping("/steal")
    @ResponseStatus(HttpStatus.CREATED)
    public void stealPictures(@RequestBody StealNasaPicturesRequestInfoDto stealNasaPicturesRequestInfoDto) {
        nasaPictureService.stealPictures(stealNasaPicturesRequestInfoDto);
    }

    @GetMapping
    public Page<PictureInfoDto> getStolenPictures(Pageable pageable) {
        return nasaPictureService.getStolenPictures(pageable);
    }
}
