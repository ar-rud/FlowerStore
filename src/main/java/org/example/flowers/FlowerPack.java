package org.example.flowers;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlowerPack {
    private int quantity;
    private Flower flower;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    public int getPrice() {
        return flower.getPrice() * quantity;
    }
}

