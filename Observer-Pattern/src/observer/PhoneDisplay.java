package observer;

import observable.WeatherStation;

public class PhoneDisplay extends AbstractObserver implements Display {

    WeatherStation weatherStation;

    public PhoneDisplay(WeatherStation weatherStation) {
        super();
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println(" PhoneDisplay Observer with ID ["+id+"] is Updated");
        display();
    }


    @Override
    public void display(){
        System.out.println("PhoneDisplay Temperature = " + weatherStation.getTemperature());
    }
}
