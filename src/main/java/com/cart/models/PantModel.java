package com.cart.models;

import java.util.ArrayList;
import java.util.List;

import com.cart.entities.Pant;

public class PantModel {
    private List<Pant> pants;

    public PantModel() {
        this.pants = new ArrayList<Pant>();

        this.pants.add(new Pant("pants01","Nike SB", "Flexible","28-30", "Blue", 39.00));
        this.pants.add(new Pant("pants02","Volcom", "Cargo", "32-32", "Purple", 34.00));
        this.pants.add(new Pant("pants03","Vans", "Lounge", "30-36", "Red", 37.00));
        this.pants.add(new Pant("pants04","Dickies", "Slim Straight", "36-32", "Green", 33.00));
        this.pants.add(new Pant("pants05","Adidas", "Khakis", "30-36", "Red", 36.00));
    }

    public List<Pant> findAll() {
        return this.pants;
    }

    public Pant find(String id) {
        for (Pant pant : this.pants) {
            if (pant.getId().equalsIgnoreCase(id)) {
                return pant;
            }
        }
        return null;
    }
}
