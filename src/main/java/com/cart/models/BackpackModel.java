package com.cart.models;

import java.util.ArrayList;
import java.util.List;
import com.cart.entities.Backpack;

public class BackpackModel {
    private List<Backpack> backpacks;

    public BackpackModel() {
        this.backpacks = new ArrayList<Backpack>();

        this.backpacks.add(new Backpack("bag01","Element", "Large","Brown", "Yes", 64.00F));
        this.backpacks.add(new Backpack("bag02","Nike", "Medium", "Orange", "Yes", 54.00F));
        this.backpacks.add(new Backpack("bag03","Vans", "Small", "Blue", "No", 26.00F));
        this.backpacks.add(new Backpack("bag04","Hurley", "XL", "Green", "No", 70.00F));
        this.backpacks.add(new Backpack("bag05","Under Armour", "Large", "Red", "Yes", 75.00F));
    }

    public List<Backpack> findAll() {
        return this.backpacks;
    }

    public Backpack find(String id) {
        for (Backpack backpack : this.backpacks) {
            if (backpack.getId().equalsIgnoreCase(id)) {
                return backpack;
            }
        }
        return null;
    }
}
