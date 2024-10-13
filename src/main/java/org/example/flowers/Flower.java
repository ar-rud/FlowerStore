package org.example.flowers;

import lombok.*;

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class Flower {
    private int sepalLength;
    private FlowerColor color;
    private int price;
    private FlowerType type;

    public Flower(Flower flower){
        color = flower.color;
        sepalLength = flower.sepalLength;
        price = flower.price;
        type = flower.type;
    }

    public String getColor(){
        return color.toString();
    }
}
