package patterns.factorymethod;

public class Program {
    public static void main(String[] args) {
        PizzaStore fPizzaStore = new ChicagoStylePizzaStore();
        fPizzaStore.orderPizza("cheese");
    }
}
