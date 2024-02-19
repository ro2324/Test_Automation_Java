package pizza;

public class Main {
    public static void main(String[] args) {

        // Create pizzas with base cost
        PizzaBase standardPizza = new StandardPizzaBase(5.0);
        PizzaBase softPizza = new SoftPizzaBase(6.0);

        // Create toppings with their respective costs
        PizzaToppings tomato = new PizzaToppings("Tomato", 1.0);
        PizzaToppings corn = new PizzaToppings("Corn", 1.5);
        PizzaToppings mushrooms = new PizzaToppings("Mushrooms", 2.0);

        // Create pizza orders and add toppings
        PizzaOrder order1 = new PizzaOrder(standardPizza);
        order1.addPizzaToppings(tomato);
        order1.addPizzaToppings(corn);

        PizzaOrder order2 = new PizzaOrder(softPizza);
        order2.addPizzaToppings(tomato);
        order2.addPizzaToppings(mushrooms);

        System.out.println(order1.calculateTotalCost());
        System.out.println(order2.calculateTotalCost());
    }
}
