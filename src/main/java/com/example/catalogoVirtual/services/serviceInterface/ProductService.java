package com.example.catalogoVirtual.services.serviceInterface;

import com.example.catalogoVirtual.entities.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductService {
    Optional<Product>findById(UUID id);
    Product createProduct(Product product);
    List<Product> showAllProducts();
    Product updateProduct(Product product);
    void deleteProduct(UUID id);

    }
