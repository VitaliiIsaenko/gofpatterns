package patterns.decorator.decorators;

import patterns.decorator.Beverage;
import patterns.decorator.Size;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
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
                cost += .15;
                break;
            case Medium:
                cost += .10;
                break;
            case Small:
                cost+= .5;
        }
        return cost;
    }
}
