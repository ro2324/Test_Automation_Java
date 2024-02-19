package NewYearGift;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Define a method in ChildrenGift class to iterate through sweets list and sum their weights.
 */
public class ChildrenGift {
    List<Sweets> sweetsList;

    public ChildrenGift() {
        this.sweetsList = new ArrayList<>();
    }

    public void addSweet(Sweets sweets) {
        sweetsList.add(sweets);
    }

    //Method to iterate through sweets list and sum the weights
    public double getTotalWeight() {
        return sweetsList.stream().mapToDouble(Sweets::getWeight).sum();
    }

    //This method is implemented to take a sorting criteria ("weight" or "category") as input &
    // use Collections.sort with a comparator based on the user selected criteria.
    public void sortBy(String criteria) {
        if (criteria.equals("weight")) {
            sweetsList.sort(Comparator.comparingDouble(Sweets::getWeight));
        } else if (criteria.equals("category")) {
            sweetsList.sort(Comparator.comparing(Sweets::getCategory));
        } else {
            throw new IllegalArgumentException("Invalid sorting criteria");
        }
    }

    //This method takes min and max weight as input and uses
    // list comprehension or filtering to find sweets within the given range.
    public List<Sweets> findByWeightRange(double minWeight, double maxWeight) {
        return sweetsList.stream().filter(sweet -> sweet.getWeight() >= minWeight && sweet.getWeight() <= maxWeight).toList();
    }
}

