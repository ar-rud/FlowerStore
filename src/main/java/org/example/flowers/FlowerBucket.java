package org.example.flowers;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> bucket;

    public FlowerBucket() {
        this.bucket = new ArrayList<>();
    }

    public void  add(FlowerPack flowerPack){
        bucket.add(flowerPack);
    }

    public int getPrice(){
        int res = 0;
        for (FlowerPack flowerPack : bucket) {
            res += flowerPack.getPrice();
        }
        return res;
    }
}
