package strategy.behaviors.quack;

import strategy.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
