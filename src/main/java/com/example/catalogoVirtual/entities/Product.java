package com.example.catalogoVirtual.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="productos")
public class Product {

    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    private UUID id;
    private String productName;
    private float price;
    private String description;
    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ProductImage productImage;

}
