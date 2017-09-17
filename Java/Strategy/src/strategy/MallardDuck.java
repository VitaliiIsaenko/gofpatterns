package strategy;

import strategy.behaviors.fly.FlyWithWings;
import strategy.behaviors.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        super.flyBehavior = new FlyWithWings();
        super.quackBehavior = new Quack();
    }

    @Override
    public void dysplay() {
        System.out.println("I'm a Mallard duck");
    }
}
