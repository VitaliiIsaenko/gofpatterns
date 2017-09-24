package patterns.factory;

public class Program {
    public static void main(String[] args) {
        PizzaStore fPizzaStore = new ChicagoStylePizzaStore();
        fPizzaStore.orderPizza("cheese");
    }
}
