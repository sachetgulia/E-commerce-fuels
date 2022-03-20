package com.ecommerce.Dto;

import java.util.HashSet;

public class Merchant {
    private int merchantId;
    private int totalProducts;
    private int merchantRating;
    private int productSold;

    public Merchant(int merchantId, int totalProducts, int merchantRating, int productSold, HashSet<Integer> productIds) {
        this.merchantId = merchantId;
        this.totalProducts = totalProducts;
        this.merchantRating = merchantRating;
        this.productSold = productSold;
        this.productIds = productIds;
    }

    public int getProductSold() {
        return productSold;
    }

    public void setProductSold(int productSold) {
        this.productSold = productSold;
    }

    private HashSet<Integer> productIds;

    public int getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public int getTotalProducts() {
        return totalProducts;
    }

    public void setTotalProducts(int totalProducts) {
        this.totalProducts = totalProducts;
    }

    public int getMerchantRating() {
        return merchantRating;
    }

    public void setMerchantRating(int merchantRating) {
        this.merchantRating = merchantRating;
    }

    public HashSet<Integer> getProductIds() {
        return productIds;
    }

    public void setProductIds(HashSet<Integer> productIds) {
        this.productIds = productIds;
    }

}
