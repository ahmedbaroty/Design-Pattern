package observer;

import observable.WeatherStation;

public class WindowDisplay extends AbstractObserver implements Display {
    WeatherStation weatherStation;

    public WindowDisplay(WeatherStation weatherStation) {
        super();
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println(" WindowDisplay Observer with ID [" + id + "] is Updated");
        display();
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void display() {
        System.out.println("WindowDisplay Temperature = " + weatherStation.getTemperature());
    }
}
