package com.example.nasapicturestealer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "pictures")
@Data
public class Picture {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pictures_id_gen")
    @SequenceGenerator(
            name = "pictures_id_gen",
            sequenceName = "pictures_id_seq",
            allocationSize = 1
    )
    private Long id;

    @Column(name = "nasa_id", nullable = false, unique = true)
    private Long nasaId;

    @Column(name = "img_src", nullable = false)
    private String imgSrc;

    @Column(name = "created_at", nullable = false)
    private LocalDate createdAt;

    @ManyToOne(optional = false)
    @JoinColumn(name = "camera_id")
    private Camera camera;
}
