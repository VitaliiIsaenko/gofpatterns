package strategy;

import strategy.behaviors.fly.FlyNoWay;
import strategy.behaviors.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void dysplay() {
        System.out.println("I'm a Model duck");
    }
}
