package patterns.decorator;

import patterns.decorator.decorators.*;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " " + beverage.getCost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " " + beverage2.getCost());

        Beverage beverage3 = new Espresso();
        beverage3.setSize(Size.Big);
        beverage3 = new Mocha(beverage3);
        System.out.println(beverage3.getCost());
    }
}
