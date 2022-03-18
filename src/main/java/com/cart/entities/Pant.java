package com.cart.entities;

public class Pant {
    private String id;
    private String pantsBrand;
    private String pantsType;
    private String pantsSize;
    private String pantsColor;
    private double price;

    public Pant(String id, String pantsBrand, String pantsType, String pantsSize, String pantsColor, double price) {
        this.id = id;
        this.pantsBrand = pantsBrand;
        this.pantsType = pantsType;
        this.pantsSize = pantsSize;
        this.pantsColor = pantsColor;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPantsBrand() {
        return pantsBrand;
    }

    public void setPantsBrand(String pantsBrand) {
        this.pantsBrand = pantsBrand;
    }

    public String getPantsType() {
        return pantsType;
    }

    public void setPantsType(String pantsType) {
        this.pantsType = pantsType;
    }

    public String getPantsSize() {
        return pantsSize;
    }

    public void setPantsSize(String pantsSize) {
        this.pantsSize = pantsSize;
    }

    public String getPantsColor() {
        return pantsColor;
    }

    public void setPantsColor(String pantsColor) {
        this.pantsColor = pantsColor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
