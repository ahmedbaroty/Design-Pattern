import observable.WeatherStation;
import observer.PhoneDisplay;
import observer.WindowDisplay;

public class Main {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);
        WindowDisplay windowDisplay = new WindowDisplay(weatherStation);

        weatherStation.add(phoneDisplay);
        weatherStation.add(windowDisplay);

        weatherStation.setTemperature(12);
        weatherStation.notify_all();

        weatherStation.setTemperature(40);
        weatherStation.notify_all();

        weatherStation.remove(windowDisplay);
        weatherStation.setTemperature(33);
        weatherStation.notify_all();


    }
}
