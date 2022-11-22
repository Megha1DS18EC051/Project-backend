package com.finalproject.finalproject.repository;


import com.finalproject.finalproject.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImageRepo extends JpaRepository<Image, Long> {
    Optional<Image> findByName(String name);

}
