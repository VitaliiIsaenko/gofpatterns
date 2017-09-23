package patterns.decorator;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double getCost() {
        switch (getSize()) {
            case Big:
                return 2.25;
            case Medium:
                return 1.99;
            case Small:
                return 1.65;
            default:
                return 1.99;
        }
    }
}
