package com.cart.models;

import java.util.ArrayList;
import java.util.List;

import com.cart.entities.Hoodie;
import com.cart.entities.Hoodie;

public class HoodieModel {
    private List<Hoodie> hoodies;

    public HoodieModel() {
        this.hoodies = new ArrayList<Hoodie>();

        this.hoodies.add(new Hoodie("hoodie01","NikeSB", "Large","Blue", 99.00));
        this.hoodies.add(new Hoodie("hoodie02","Vans", "XL", "Yellow", 91.00));
        this.hoodies.add(new Hoodie("hoodie03","Polar Skate", "Medium", "Green", 106.00));
        this.hoodies.add(new Hoodie("hoodie04","Volcom", "Small", "Orange", 97.00));
        this.hoodies.add(new Hoodie("hoodie05","Dickies", "Medium", "Pink", 102.00));
    }

    public List<Hoodie> findAll() {
        return this.hoodies;
    }

    public Hoodie find(String id) {
        for (Hoodie hoodie : this.hoodies) {
            if (hoodie.getId().equalsIgnoreCase(id)) {
                return hoodie;
            }
        }
        return null;
    }
}
