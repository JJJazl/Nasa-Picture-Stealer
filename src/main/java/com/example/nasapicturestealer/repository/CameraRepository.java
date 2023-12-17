package com.example.nasapicturestealer.repository;

import com.example.nasapicturestealer.entity.Camera;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CameraRepository extends JpaRepository<Camera, Long> {

    Optional<Camera> findCameraByNasaId(Long nasaId);
}
