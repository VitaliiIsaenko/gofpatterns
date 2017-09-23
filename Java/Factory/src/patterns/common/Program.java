package patterns.common;

import patterns.factory.ChicagoStylePizzaStore;
import patterns.factory.FPizzaStore;
import patterns.simplefactory.SFPizzaSrore;
import patterns.simplefactory.SimplePizzaFactory;

public class Program {
    public static void main(String[] args) {
        SFPizzaSrore pizzaSrore = new SFPizzaSrore(new SimplePizzaFactory());
        pizzaSrore.orderPizza("cheese");

        FPizzaStore fPizzaStore = new ChicagoStylePizzaStore();
        fPizzaStore.orderPizza("cheese");
    }
}
