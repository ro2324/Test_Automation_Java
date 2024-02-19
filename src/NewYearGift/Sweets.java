package NewYearGift;

/**
 * This is an abstract class Sweets with attributes name, weight, and category
 */

public abstract class Sweets {
    String name;
    double weight;

    String category;

    public Sweets(String name, double weight, String category) {
        this.name = name;
        this.weight = weight;
        this.category = category;
    }


    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return name + " [" + weight + "grams, " + category + "]";
    }
}
