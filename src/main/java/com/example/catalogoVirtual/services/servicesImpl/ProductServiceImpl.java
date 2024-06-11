package com.example.catalogoVirtual.services.servicesImpl;

import com.example.catalogoVirtual.entities.Product;
import com.example.catalogoVirtual.services.serviceInterface.ProductService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ProductServiceImpl implements ProductService {
    @Override
    public Optional<Product> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public List<Product> showAllProducts() {
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public void deleteProduct(UUID id) {

    }
}
