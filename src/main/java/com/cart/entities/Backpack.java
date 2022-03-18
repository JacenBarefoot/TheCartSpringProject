package com.cart.entities;

public class Backpack {

    private String id;
    private String bagBrand;
    private String bagSize;
    private String bagColor;
    private String isWaterproof;
    private double price;

    public Backpack(String id, String bagBrand, String bagSize, String bagColor, String isWaterproof, double price) {
        this.id = id;
        this.bagBrand = bagBrand;
        this.bagSize = bagSize;
        this.bagColor = bagColor;
        this.isWaterproof = isWaterproof;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBagBrand() {
        return bagBrand;
    }

    public void setBagBrand(String bagBrand) {
        this.bagBrand = bagBrand;
    }

    public String getBagSize() {
        return bagSize;
    }

    public void setBagSize(String bagSize) {
        this.bagSize = bagSize;
    }

    public String getBagColor() {
        return bagColor;
    }

    public void setBagColor(String bagColor) {
        this.bagColor = bagColor;
    }

    public String getIsWaterproof() {
        return isWaterproof;
    }

    public void setIsWaterproof(String isWaterproof) {
        this.isWaterproof = isWaterproof;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
