package bouquetofflowers;

import java.util.HashMap;
import java.util.Map;

/**
 * This class represents a collection of flowers
 */
public class Bouquet {


    private final Map<String, Integer> flowerCounts;
    private final Map<String, Flower> flowers;

    public Bouquet() {
        flowerCounts = new HashMap<>();
        flowers = new HashMap<>();

        // Initialize the given flowers
        flowers.put("Rose", new Flower("Rose", 1));
        flowers.put("Jasmine", new Flower("Jasmine", 2));
        flowers.put("Lily", new Flower("Lily", 3));
    }

    // Method to add flowers to the bouquet
    public void addFlower(String flowerType, int quantity) {
        if (flowers.containsKey(flowerType)) {
            flowerCounts.put(flowerType, quantity);
        } else {
            System.out.println("Unknown flower type: " + flowerType);
        }
    }

    // Utility method to calculate the cost of the bouquet
    public int calculateCost() {
        int totalCost = 0;
        for (String flowerType : flowerCounts.keySet()) {
            int quantity = flowerCounts.get(flowerType);
            Flower flower = flowers.get(flowerType);
            totalCost += quantity * flower.getCost();
        }
        return totalCost;
    }
}
