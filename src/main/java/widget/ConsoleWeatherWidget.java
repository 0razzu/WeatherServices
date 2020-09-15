package widget;


public class ConsoleWeatherWidget extends WeatherWidget {
    @Override
    public String toString() {
        return getCity() + ' ' + getCurrentTemperature() + " ºC";
    }
}
