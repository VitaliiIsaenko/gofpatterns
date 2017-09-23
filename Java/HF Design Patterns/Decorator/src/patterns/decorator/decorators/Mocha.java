package patterns.decorator.decorators;

import patterns.decorator.Beverage;
import patterns.decorator.Size;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }

    @Override
    public double getCost() {
        double cost = beverage.getCost();
        switch (beverage.getSize()){
            case Big:
                cost += .25;
                break;
            case Medium:
                cost += .20;
                break;
            case Small:
                cost+= .15;
        }
        return cost;
    }
}
