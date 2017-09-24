package patterns.simplefactory.pizzas;

public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
    }

    @Override
    public void bake() {
    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {
        System.out.println("Cheese pizza is ready!");
    }
}
