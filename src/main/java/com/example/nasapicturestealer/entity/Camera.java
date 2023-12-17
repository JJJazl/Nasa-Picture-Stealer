package com.example.nasapicturestealer.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cameras")
@Data
@ToString(exclude = "pictures")
public class Camera {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cameras_id_gen")
    @SequenceGenerator(
            name = "cameras_id_gen",
            sequenceName = "cameras_id_seq",
            allocationSize = 1
    )
    private Long id;

    @Column(name = "nasa_id", nullable = false, unique = true)
    private Long nasaId;

    @Column(name = "name", nullable = false)
    private String name;

    @Setter(AccessLevel.PRIVATE)
    @OneToMany(mappedBy = "camera", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Picture> pictures = new ArrayList<>();

    public void addPicture(Picture picture) {
        picture.setCamera(this);
        pictures.add(picture);
    }
}
