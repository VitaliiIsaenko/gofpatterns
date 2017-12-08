package patterns.decorator;

import patterns.Quackable;
import patterns.observer.Observable;
import patterns.observer.Observer;

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;
    Observable observable;

    public QuackCounter(Quackable duck) {
        observable = new Observable(duck);
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
        notifyObservers();
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
