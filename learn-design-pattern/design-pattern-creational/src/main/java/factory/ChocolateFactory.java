package factory;

import factory.candy.Candy;
import factory.candy.Chocolate_dark;
import factory.candy.Chocolate_milk;
import factory.candy.Chocolate_white;


public class ChocolateFactory extends CandyFactory {
    
    @Override
    public Candy getCandy(String section) {
        switch (section) {
            case "dark":
                return new Chocolate_dark();
            case "white":
                return new Chocolate_white();
            case "milk":
                return new Chocolate_milk();
            default:
                return new Chocolate_milk();
        }
    }
    
}
