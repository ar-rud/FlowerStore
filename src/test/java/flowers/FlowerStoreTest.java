package flowers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.List;
import java.util.ArrayList;

import org.example.flowers.Flower;
import org.example.flowers.FlowerBucket;
import org.example.flowers.FlowerColor;
import org.example.flowers.FlowerPack;
import org.example.flowers.FlowerType;
import org.example.flowers.Store;

public class FlowerStoreTest {
    private static final int FLOWER_QUANTITY = 6;
    private Store flowerStore;
    private final Flower flower = new Flower(80, FlowerColor.RED, 
                                        50, FlowerType.ROSE);
    private final FlowerPack flowerPack = new FlowerPack(flower, 5);
    private final Flower secondFlower = new Flower(80, FlowerColor.YELLOW, 
                                        60, FlowerType.TULIP);
    private final FlowerPack secondFlowerPack = new FlowerPack(secondFlower, 5);
    @BeforeEach
    public void init() {
        flowerStore = new Store();
    }
    @Test
    public void testStore() {
        FlowerBucket bucket = new FlowerBucket();
        bucket.add(flowerPack);
        bucket.add(secondFlowerPack);
        FlowerBucket secondBucket = new FlowerBucket();
        secondBucket.add(secondFlowerPack);
        FlowerPack thirdFlowerPack = new FlowerPack(secondFlower,
                FLOWER_QUANTITY);
        FlowerBucket thirdFlowerBucket = new FlowerBucket();
        thirdFlowerBucket.add(thirdFlowerPack);
        flowerStore.add(bucket);
        flowerStore.add(secondBucket);

        List<FlowerBucket> match = flowerStore.search(secondBucket);
        FlowerBucket flowerSearched = match.get(0);
        Assertions.assertEquals(secondBucket, flowerSearched);
        match = flowerStore.search(thirdFlowerBucket);
        Assertions.assertEquals(match, new ArrayList<FlowerBucket>());
    }
}