package com.onshop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Product {

    @Id
    private Long id;

    private String name;

    private String description;

    private Integer price;




}
