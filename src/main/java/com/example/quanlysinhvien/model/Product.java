package com.example.quanlysinhvien.model;

public class Product {
    private int productId;
    private String productName;
    private float price;
    private String description;
    private String imageUrl;

    public Product(int productId, String productName, float price, String description, String imageUrl) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
