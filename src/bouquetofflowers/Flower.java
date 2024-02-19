package bouquetofflowers;

/**
 * This class represents different type of flowers and cost.
 */
public class Flower {
    private final String name;
    private final Integer cost;

    public Flower(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}
