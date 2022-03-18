package com.cart.entities;

public class Shoe {
    private String id;
    private String shoeBrand;
    private String shoeType;
    private Float shoeSize;
    private String shoeColor;
    private double price;

    public Shoe(String id, String shoeBrand, String shoeType, Float shoeSize, String shoeColor, double price) {
        this.id = id;
        this.shoeBrand = shoeBrand;
        this.shoeType = shoeType;
        this.shoeSize = shoeSize;
        this.shoeColor = shoeColor;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShoeBrand() {
        return shoeBrand;
    }

    public void setShoeBrand(String shoeBrand) {
        this.shoeBrand = shoeBrand;
    }

    public String getShoeType() {
        return shoeType;
    }

    public void setShoeType(String shoeType) {
        this.shoeType = shoeType;
    }

    public Float getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(Float shoeSize) {
        this.shoeSize = shoeSize;
    }

    public String getShoeColor() {
        return shoeColor;
    }

    public void setShoeColor(String shoeColor) {
        this.shoeColor = shoeColor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
