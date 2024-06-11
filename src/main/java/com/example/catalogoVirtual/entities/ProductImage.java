package com.example.catalogoVirtual.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Lob
    byte[]productImage;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
