package com.cart.entities;

public class Item {

    private Backpack backpack;
    private Skateboard skateboard;
    private Pant pant;
    private Hoodie hoodie;
    private Shoe shoe;

    private int quantity;

    public Skateboard getSkateboard() {
        return skateboard;
    }

    public void setSkateboard(Skateboard skateboard) {
        this.skateboard = skateboard;
    }

    public Backpack getBackpack() { return backpack; }

    public void setBackpack(Backpack backpack) { this.backpack = backpack; }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Pant getPant() {
        return pant;
    }

    public void setPant(Pant pant) {
        this.pant = pant;
    }

    public Hoodie getHoodie() {
        return hoodie;
    }

    public void setHoodie(Hoodie hoodie) {
        this.hoodie = hoodie;
    }

    public Shoe getShoe() {
        return shoe;
    }

    public void setShoe(Shoe shoe) {
        this.shoe = shoe;
    }

    public Item(Skateboard skateboard, Backpack backpack, Shoe shoe, Hoodie hoodie, Pant pant, int quantity) {
        this.skateboard = skateboard;
        this.backpack = backpack;
        this.shoe = shoe;
        this.hoodie = hoodie;
        this.pant = pant;
        this.quantity = quantity;
    }
}
