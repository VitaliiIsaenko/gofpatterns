package patterns.observer;
import patterns.observer.interfaces.*;
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " degrees and " + humidity + " hunidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
