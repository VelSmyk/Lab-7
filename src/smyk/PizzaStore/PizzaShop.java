package smyk.PizzaStore;
import smyk.PizzaStore.pizzaStyle.italianStylePizza.ItalianStyleCheese;
import smyk.PizzaStore.pizzaStyle.italianStylePizza.ItalianStyleMargarita;
import smyk.PizzaStore.pizzaStyle.italianStylePizza.ItalianStylePepperoni;
import smyk.PizzaStore.pizzaStyle.greeceStylePizza.GreeceStyleCheese;
import smyk.PizzaStore.pizzaStyle.greeceStylePizza.GreeceStyleMargarita;
import smyk.PizzaStore.pizzaStyle.greeceStylePizza.GreeceStylePepperoni;

public abstract class PizzaShop {
    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println("Ваша пицца готова! Спасибо, приходите еще!");
        return pizza;
    }
    protected abstract Pizza createPizza(PizzaType type);
    public static class GreecePizzaShop extends PizzaShop{
        @Override
        protected Pizza createPizza(PizzaType type) {
            return switch (type) {
                case MARGARITA -> new GreeceStyleMargarita();
                case PEPPERONI -> new GreeceStylePepperoni();
                case CHEESE -> new GreeceStyleCheese();
            };
        }
    }
    public static class ItalianPizzaShop extends PizzaShop{
        @Override
        protected Pizza createPizza(PizzaType type) {
            return switch (type) {
                case MARGARITA -> new ItalianStyleMargarita();
                case PEPPERONI -> new ItalianStylePepperoni();
                case CHEESE -> new ItalianStyleCheese();
            };
        }
    }
}