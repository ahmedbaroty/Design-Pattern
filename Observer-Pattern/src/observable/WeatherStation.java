package observable;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WeatherStation implements Observable {

    private List<Observer> observerList = new ArrayList<>();
    private int temperature;

    public WeatherStation() {
    }

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList = observerList.stream().filter(observer1 -> observer.getId() != observer1.getId()).collect(Collectors.toList());
    }

    @Override
    public void notify_all() {
        observerList.stream().forEach(observer -> observer.update());
    }


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
