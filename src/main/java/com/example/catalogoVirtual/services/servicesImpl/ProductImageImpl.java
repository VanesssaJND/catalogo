package com.example.catalogoVirtual.services.servicesImpl;

import com.example.catalogoVirtual.entities.ProductImage;
import com.example.catalogoVirtual.repositories.ProductImageRepo;
import com.example.catalogoVirtual.services.serviceInterface.ProductImageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@Service
public class ProductImageImpl implements ProductImageService{

    ProductImageRepo productImageRepo;
    @Override
    public ProductImage store(MultipartFile file) throws IOException {
        String imageName = StringUtils.cleanPath(file.getOriginalFilename());
        ProductImage productImage = ProductImage.builder()
                .name(imageName)
                .type(file.getContentType())
                .productImage(file.getBytes())
                .build();
        return productImageRepo.save(productImage);
    }
    @Override
    public Optional<ProductImage> getImage(UUID id) throws FileNotFoundException {
        Optional<ProductImage> image = productImageRepo.findById(id);
        if (image.isPresent()){
            return image;
        }else{
        throw new FileNotFoundException();
        }
    }
}
