package smyk.PizzaStore;
public class Main {
    public static void main(String[] args) {
        PizzaShop italianPizzaShop = new PizzaShop.ItalianPizzaShop();
        italianPizzaShop.orderPizza(PizzaType.MARGARITA);
        PizzaShop greecePizzaShop = new PizzaShop.GreecePizzaShop();
        greecePizzaShop.orderPizza(PizzaType.PEPPERONI);
        italianPizzaShop.createPizza(PizzaType.CHEESE);

    }
}