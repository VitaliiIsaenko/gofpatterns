package patterns.observer;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    void notifyObservers();
}
