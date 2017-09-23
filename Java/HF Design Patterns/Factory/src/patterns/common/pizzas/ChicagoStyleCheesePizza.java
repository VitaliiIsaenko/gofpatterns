package patterns.common.pizzas;

public class ChicagoStyleCheesePizza implements Pizza {
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
        System.out.println("Chicago style cheese pizza is ready!");
    }
}
