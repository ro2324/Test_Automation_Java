package NewYearGift;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ChildrenGift childrenGift = new ChildrenGift();
        childrenGift.addSweet(new Chocolates("Truffle", 10));
        childrenGift.addSweet(new Candies("Lollipop", 20));
        childrenGift.addSweet(new Chocolates("Dark Chocolate", 30));
        childrenGift.addSweet(new Candies("JellyBean", 40));

        System.out.println("Total weight: " + childrenGift.getTotalWeight() + "g");

        childrenGift.sortBy("weight");
        System.out.println("\nSweets sorted by weight:");
        for (Sweets sweet : childrenGift.sweetsList) {
            System.out.println(sweet);
        }

        List<Sweets> lightSweets = childrenGift.findByWeightRange(15, 25);
        System.out.println("\nSweets between 15g and 25g:");
        for (Sweets sweet : lightSweets) {
            System.out.println(sweet);
        }
    }
}
