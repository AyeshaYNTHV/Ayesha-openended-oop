package com.example.demo;

public class Product {
    private int id;
    private String name;
    private double price;
    private String imageUrl; // Add this property

    public Product(int id, String name, double price, String imageUrl) { // Update constructor
        this.id = id;
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getImageUrl() {
        return imageUrl;
    }
}
