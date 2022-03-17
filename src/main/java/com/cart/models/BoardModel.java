package com.cart.models;

import java.util.ArrayList;
import java.util.List;

import com.cart.entities.Product;
import com.cart.entities.Skateboard;

public class BoardModel {
    private List<Skateboard> skateboards;

    public BoardModel() {
        this.skateboards = new ArrayList<Skateboard>();
        this.skateboards.add(new Skateboard("b01","Pizza", 9.5F, 56, "blue", 69.00F));
        this.skateboards.add(new Skateboard("b02","Anti-Hero", 9.1F, 63, "red", 67.00F));
        this.skateboards.add(new Skateboard("b03","Zero", 8.5F, 67, "green", 68.00F));
    }

    public List<Skateboard> findAll() {
        return this.skateboards;
    }

    public Skateboard find(String id) {
        for (Skateboard skateboard : this.skateboards) {
            if (skateboard.getId().equalsIgnoreCase(id)) {
                return skateboard;
            }
        }
        return null;
    }
}
