package patterns.javaobserver;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();

        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(wd);

        wd.setMeasurements(10, 20,50);
        wd.setMeasurements(50, 20,50);
        wd.setMeasurements(50, 50,50);
    }
}
