package patterns.abstractfactory.pizzas;

import patterns.abstractfactory.ingredients.*;

public abstract class Pizza {
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clams clams;

    public abstract void prepare();

    public void bake(){

    }
    public void cut(){

    }
    public void box(){
        System.out.println(sauce.getClass().getName());
    }
}
