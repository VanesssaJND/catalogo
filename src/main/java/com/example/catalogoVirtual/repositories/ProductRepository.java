package com.example.catalogoVirtual.repositories;

import com.example.catalogoVirtual.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
}
