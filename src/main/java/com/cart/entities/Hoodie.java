package com.cart.entities;

public class Hoodie {

    private String id;
    private String hoodieBrand;
    private String hoodieSize;
    private String hoodieColor;
    private double price;

    public Hoodie(String id, String hoodieBrand, String hoodieSize, String hoodieColor, double price) {
        this.id = id;
        this.hoodieBrand = hoodieBrand;
        this.hoodieSize = hoodieSize;
        this.hoodieColor = hoodieColor;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoodieBrand() {
        return hoodieBrand;
    }

    public void setHoodieBrand(String hoodieBrand) {
        this.hoodieBrand = hoodieBrand;
    }

    public String getHoodieSize() {
        return hoodieSize;
    }

    public void setHoodieSize(String hoodieSize) {
        this.hoodieSize = hoodieSize;
    }

    public String getHoodieColor() {
        return hoodieColor;
    }

    public void setHoodieColor(String hoodieColor) {
        this.hoodieColor = hoodieColor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
