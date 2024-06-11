package com.example.catalogoVirtual.services.serviceInterface;

import com.example.catalogoVirtual.entities.ProductImage;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;
import java.util.UUID;

public interface ProductImageService {

    //subir archivo
    ProductImage store(MultipartFile file)throws IOException;

    //descargar archivo
    Optional<ProductImage> getImage(UUID id) throws FileNotFoundException;



}
