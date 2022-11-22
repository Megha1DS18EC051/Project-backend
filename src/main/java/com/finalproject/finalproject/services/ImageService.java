package com.finalproject.finalproject.services;


import com.finalproject.finalproject.models.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ImageService {

    Image saveImage(Image image);

    void deleteImage(long id);
    Image updateImage(Image image,long id);

    List<Image> getAllImages();
    Image getImageById(int id);

}
