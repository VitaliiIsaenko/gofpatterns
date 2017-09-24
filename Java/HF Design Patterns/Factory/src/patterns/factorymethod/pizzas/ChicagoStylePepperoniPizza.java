package patterns.factorymethod.pizzas;

public class ChicagoStylePepperoniPizza implements Pizza {
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
        System.out.println("Chicago style pepperoni pizza is ready!");
    }
}
