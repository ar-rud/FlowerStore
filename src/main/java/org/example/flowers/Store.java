package org.example.flowers;
import java.util.List;
import java.util.ArrayList;

public class Store {
    private List<FlowerBucket> stock;

    public Store() {
        stock = new ArrayList<>();
    }
    public void add(FlowerBucket flowerBucket) {
        stock.add(flowerBucket);
    }
    public List<FlowerBucket> search(FlowerBucket flowerBucket) {
        List<FlowerBucket> matched = new ArrayList<>();
        for (FlowerBucket bucket : stock) {
            if (bucket.equals(flowerBucket)) {
                matched.add(bucket);
            }
        }
        return matched;
    }
}
