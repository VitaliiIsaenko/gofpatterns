package patterns.factory.pizzas;

public class NYStylePepperoniPizza implements Pizza {
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
        System.out.println("NY style pepperoni pizza is ready!");
    }
}
