package com.example.catalogoVirtual.repositories;

import com.example.catalogoVirtual.entities.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductImageRepo extends JpaRepository<ProductImage, UUID> {
}
