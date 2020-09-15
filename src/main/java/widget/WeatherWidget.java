package widget;


public class WeatherWidget {
    private String city;
    private int currentTemperature;
    
    
    public WeatherWidget() {
    }
    
    
    public void setCity(String city) {
        this.city = city;
    }
    
    
    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }
    
    
    public String getCity() {
        return city;
    }
    
    
    public int getCurrentTemperature() {
        return currentTemperature;
    }
    
    
    @Override
    public String toString() {
        return "WeatherWidget {city: " + city +
                ", currentTemperature: " + currentTemperature + '}';
    }
}
