package patterns.decorator.decorators;

import patterns.decorator.Beverage;
import patterns.decorator.Size;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
    public abstract Size getSize();
}
