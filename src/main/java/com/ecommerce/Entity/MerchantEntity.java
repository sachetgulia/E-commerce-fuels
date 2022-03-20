package com.ecommerce.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

@Document(collection = "merchant")
public class MerchantEntity {
    @Id
    @Column(name = "productId", nullable = false)
    private int merchantId;
    @NotBlank(message = "Student cant be empty")
    private int allProductsOffered;
    private int productSold;
    private String merchangeName;
    private int rating;

}
