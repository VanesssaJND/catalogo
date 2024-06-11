package com.example.catalogoVirtual.controladores;

import com.example.catalogoVirtual.entities.ProductImage;
import com.example.catalogoVirtual.response.ResponseMessage;
import com.example.catalogoVirtual.services.serviceInterface.ProductImageService;
import jdk.jfr.ContentType;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/api/catalogovirtual")
public class ProductImageController {

    private ProductImageService productImageService;

    @PostMapping("/upload")
    public ResponseEntity<ResponseMessage> uploadImage(@RequestParam("image")MultipartFile image) throws IOException {
        productImageService.store(image);
        return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage("Imagen agregada exitosamente"));
    }

    @GetMapping("/images/{id}")
    public ResponseEntity<byte[]>getImage(@PathVariable UUID id)throws FileNotFoundException {
        ProductImage productImage = productImageService.getImage(id).get();
        return ResponseEntity.status(HttpStatus.OK)
                .header(HttpHeaders.CONTENT_TYPE, productImage.getType())
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; imagename=\"" + productImage.getName()+"\"")
                .body(productImage.getProductImage());
    }


}
