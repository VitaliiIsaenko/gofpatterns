package patterns.simplefactory;

public class Program {
    public static void main(String[] args) {
        PizzaStore pizzaSrore = new PizzaStore(new SimplePizzaFactory());
        pizzaSrore.orderPizza("cheese");
    }
}
