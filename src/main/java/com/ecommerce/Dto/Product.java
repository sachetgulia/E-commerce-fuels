package com.ecommerce.Dto;

public class Product {
    private int productId;
    private int merchantId;
    private int stock;

    public Product(int id, int mid, int stock, String category, String name, int price, String imgUrl, String description, int rating) {
        this.productId = id;
        this.merchantId = mid;
        this.stock = stock;
        this.category = category;
        this.name = name;
        this.price = price;
        this.imgUrl = imgUrl;
        this.description = description;
        this.rating = rating;
    }

    public int getStock() {

        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    private String category;


    public String getCategory() {

        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private String name;
    private int price;
    private String imgUrl;

    public int getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private String description;
    private int rating;



    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
