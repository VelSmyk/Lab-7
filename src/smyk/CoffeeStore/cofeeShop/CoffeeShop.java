package smyk.CoffeeStore.cofeeShop;
import smyk.CoffeeStore.Coffee;
import smyk.CoffeeStore.CoffeeType;
import smyk.CoffeeStore.americanStyle.AmericanStyleAmericano;
import smyk.CoffeeStore.americanStyle.AmericanStyleCaffeLatte;
import smyk.CoffeeStore.americanStyle.AmericanStyleCappuccino;
import smyk.CoffeeStore.americanStyle.AmericanStyleEspresso;
import smyk.CoffeeStore.englishStyle.EnglishStyleAmericano;
import smyk.CoffeeStore.englishStyle.EnglishStyleCaffeeLatte;
import smyk.CoffeeStore.englishStyle.EnglishStyleCappuccino;
import smyk.CoffeeStore.englishStyle.EnglishStyleEspresso;
import smyk.CoffeeStore.italyStyle.ItalianStyleAmericano;
import smyk.CoffeeStore.italyStyle.ItalianStyleCaffeLatte;
import smyk.CoffeeStore.italyStyle.ItalianStyleCappuccino;
import smyk.CoffeeStore.italyStyle.ItalianStyleEspresso;

public abstract class CoffeeShop {
    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = createCoffee(type);

        coffee.makeCoffee();
        coffee.addFoodColoring();
        coffee.pourIntoCup();

        System.out.println("Вот ваш кофе! Спасибо, приходите еще!");
        return coffee;
    }

    protected abstract Coffee createCoffee(CoffeeType type);

    public static class ItalianCoffeeShop extends CoffeeShop {

        @Override
        public Coffee createCoffee (CoffeeType type) {
            Coffee coffee = null;
            switch (type) {
                case AMERICANO:
                    coffee = new ItalianStyleAmericano();
                    break;
                case ESPRESSO:
                    coffee = new ItalianStyleEspresso();
                    break;
                case CAPPUCCINO:
                    coffee = new ItalianStyleCappuccino();
                    break;
                case CAFFE_LATTE:
                    coffee = new ItalianStyleCaffeLatte();
                    break;
            }
            return coffee;
        }
    }
public static class EnglishCoffeeShop extends CoffeeShop{
    @Override
    public Coffee createCoffee(CoffeeType type) {
        Coffee coffee = null;

        switch (type){
            case ESPRESSO :
                coffee = new EnglishStyleEspresso();
            break;
            case AMERICANO:
                coffee = new EnglishStyleAmericano();
                break;
            case CAFFE_LATTE:
                coffee = new EnglishStyleCaffeeLatte();
                break;
            case CAPPUCCINO:
                coffee = new EnglishStyleCappuccino();
                break;
        }
        return coffee;
    }
}

    public static class AmericanCoffeeShop extends CoffeeShop {
        @Override
        public Coffee createCoffee (CoffeeType type) {
            Coffee coffee = null;

            switch (type) {
                case AMERICANO:
                    coffee = new AmericanStyleAmericano();
                    break;
                case ESPRESSO:
                    coffee = new AmericanStyleEspresso();
                    break;
                case CAPPUCCINO:
                    coffee = new AmericanStyleCappuccino();
                    break;
                case CAFFE_LATTE:
                    coffee = new AmericanStyleCaffeLatte();
                    break;
            }

            return coffee;
        }
    }
}