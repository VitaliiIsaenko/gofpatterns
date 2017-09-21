package patterns.decorator.decorators;

import patterns.decorator.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
