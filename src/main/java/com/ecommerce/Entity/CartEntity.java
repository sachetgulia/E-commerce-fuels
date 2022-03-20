package com.ecommerce.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import java.util.HashMap;

@Document(collection = "product")
public class CartEntity {
    @Id
    @Column(name = "productId", nullable = false)
    private int userId;
    @NotBlank(message = "Student cant be empty")
    private int productId;
    private int stocksPerMerchant;

}
