package com.cart.models;

import java.util.ArrayList;
import java.util.List;
import com.cart.entities.Shoe;

public class ShoeModel {
    private List<Shoe> shoes;

    public ShoeModel() {
        this.shoes = new ArrayList<Shoe>();

        this.shoes.add(new Shoe("shoe01","DC", "Athletic",11.5F, "Red", 57.00));
        this.shoes.add(new Shoe("shoe02","Nike", "Athletic", 7.5F, "Blue", 55.00));
        this.shoes.add(new Shoe("shoe03","Vans", "Athletic", 10F, "Brown", 59.00));
        this.shoes.add(new Shoe("shoe04","Cariuma", "Athletic", 8.5F, "Grey", 54.00));
        this.shoes.add(new Shoe("shoe05","Emerica", "Athletic", 12F, "White/Black", 56.00));
    }

    public List<Shoe> findAll() {
        return this.shoes;
    }

    public Shoe find(String id) {
        for (Shoe shoe : this.shoes) {
            if (shoe.getId().equalsIgnoreCase(id)) {
                return shoe;
            }
        }
        return null;
    }
}
