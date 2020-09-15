package widget;


public class WeatherWidget {
    private String city;
    private double currentTemperature;
    
    
    public WeatherWidget() {
    }
    
    
    public void setCity(String city) {
        this.city = city;
    }
    
    
    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }
    
    
    public String getCity() {
        return city;
    }
    
    
    public double getCurrentTemperature() {
        return currentTemperature;
    }
    
    
    @Override
    public String toString() {
        return "WeatherWidget {city: " + city +
                ", currentTemperature: " + currentTemperature + '}';
    }
}
