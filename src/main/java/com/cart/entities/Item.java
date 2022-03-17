package com.cart.entities;

public class Item {
    private Product product;

    private Skateboard skateboard;
    private int quantity;

    public Skateboard getSkateboard() {
        return skateboard;
    }

    public void setSkateboard(Skateboard skateboard) {
        this.skateboard = skateboard;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item(Product product, Skateboard skateboard, int quantity) {
        this.product = product;
        this.skateboard = skateboard;
        this.quantity = quantity;
    }
}
