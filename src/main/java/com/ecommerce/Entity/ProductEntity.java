package com.ecommerce.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

@Document(collection = "product")
    public class ProductEntity {
        @Id
        @Column(name = "productId", nullable = false)
        private int productId;
        @NotBlank(message = "Student cant be empty")
        private int merchantId;
        private String name;
        private int rating;
        private int stocksPerMerchant;
        private int price;
        private String category;

    }
