package patterns.decorator.decorators;

import patterns.decorator.Beverage;
import patterns.decorator.Size;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
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
                cost += .20;
                break;
            case Medium:
                cost += .15;
                break;
            case Small:
                cost+= .10;
        }
        return cost;
    }
}
