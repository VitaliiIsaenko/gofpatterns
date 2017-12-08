package patterns;

import patterns.observer.QuackObservable;

public interface Quackable extends QuackObservable {
    void quack();
}
