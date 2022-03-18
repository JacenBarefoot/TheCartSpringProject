package com.cart.models;

import java.util.ArrayList;
import java.util.List;
import com.cart.entities.Skateboard;

public class BoardModel {
    private List<Skateboard> skateboards;

    public BoardModel() {
        this.skateboards = new ArrayList<Skateboard>();
        this.skateboards.add(new Skateboard("board01","Pizza", 9.5F, 56, "Blue", 69.00F));
        this.skateboards.add(new Skateboard("board02","Anti-Hero", 9.1F, 63, "Red", 67.00F));
        this.skateboards.add(new Skateboard("board03","Zero", 8.5F, 67, "Green", 68.00F));
        this.skateboards.add(new Skateboard("board04","Element", 8.0F, 53, "Orange", 70.00F));
        this.skateboards.add(new Skateboard("board04","Primitive", 8.25F, 61, "Purple", 71.00F));
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
