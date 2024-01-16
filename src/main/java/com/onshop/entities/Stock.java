package com.onshop.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table
@Data
public class Stock {
    @Id
    @Column(name = "stockId")
    private Long id;

    @OneToMany
    private List<Product> productId;


}
