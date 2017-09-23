package patterns.common.pizzas;

public class NYStyleCheesePizza implements Pizza {
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
        System.out.println("NY style cheese pizza is ready!");
    }
}
