package patterns.composite;

import patterns.Quackable;
import patterns.observer.Observable;
import patterns.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
    List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quackable) {
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        quackers.forEach(q -> q.quack());
    }

    @Override
    public void registerObserver(Observer observer) {
        quackers.forEach(q -> q.registerObserver(observer));
    }

    @Override
    public void notifyObservers() {
        quackers.forEach(q -> q.notifyObservers());

    }
}
