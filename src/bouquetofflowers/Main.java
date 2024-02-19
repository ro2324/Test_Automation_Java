package bouquetofflowers;

public class Main {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower("Rose", 3);
        bouquet.addFlower("Jasmine", 2);
        bouquet.addFlower("Lily", 1);

        int cost = bouquet.calculateCost();
        System.out.println("Cost of the bouquet: $" + cost);
    }
}
