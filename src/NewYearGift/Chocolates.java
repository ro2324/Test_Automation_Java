package NewYearGift;

/**
 * this class is for Chocolates and this Inherit from Sweets
 */
public class Chocolates extends Sweets {

    // constructor to create Chocolate with specific details.
    public Chocolates(String name, double weight) {
        super(name, weight, "Chocolate");
    }
}
