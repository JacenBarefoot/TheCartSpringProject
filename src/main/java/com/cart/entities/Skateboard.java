package com.cart.entities;

public class Skateboard {

    private String id;
    private String boardBrand;
    private Float boardSize;
    private Integer wheelSize;
    private String wheelColor;
    private double price;

    public String getBoardBrand() {
        return boardBrand;
    }

    public void setBoardBrand(String boardBrand) {
        this.boardBrand = boardBrand;
    }

    public Float getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(Float boardSize) {
        this.boardSize = boardSize;
    }

    public Integer getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(Integer wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String getWheelColor() {
        return wheelColor;
    }

    public void setWheelColor(String wheelColor) {
        this.wheelColor = wheelColor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Skateboard() {
    }

    public Skateboard(String id, String boardBrand, Float boardSize, Integer wheelSize, String wheelColor, Float price) {
        this.id = id;
        this.boardBrand = boardBrand;
        this.boardSize = boardSize;
        this.wheelSize = wheelSize;
        this.wheelColor = wheelColor;
        this.price = price;
    }
}
