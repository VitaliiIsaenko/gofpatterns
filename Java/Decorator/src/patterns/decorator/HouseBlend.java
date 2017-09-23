package patterns.decorator;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double getCost() {
        switch (getSize()) {
            case Big:
                return 2;
            case Medium:
                return 1.65;
            case Small:
                return 1.20;
            default:
                return 1.65;
        }
    }
}
