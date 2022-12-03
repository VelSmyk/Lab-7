package smyk.CoffeeStore;
import smyk.CoffeeStore.cofeeShop.CoffeeShop;

public class Main {
    public static void main(String[] args) {
        CoffeeShop italianCoffeeShop = new CoffeeShop.ItalianCoffeeShop();
        italianCoffeeShop.orderCoffee(CoffeeType.CAFFE_LATTE);
        CoffeeShop americanCoffeeShop = new CoffeeShop.AmericanCoffeeShop();
        americanCoffeeShop.orderCoffee(CoffeeType.CAFFE_LATTE);
        CoffeeShop englishCoffeShop = new CoffeeShop.EnglishCoffeeShop();
        englishCoffeShop.orderCoffee(CoffeeType.AMERICANO);
    }
}