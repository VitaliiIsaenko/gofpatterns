package patterns.decorator;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double getCost() {
        return .89;
    }
}
