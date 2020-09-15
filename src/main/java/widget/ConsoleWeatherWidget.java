package widget;


public class ConsoleWeatherWidget extends WeatherWidget {
    private String condition;
    
    
    public void setCondition(String condition) {
        this.condition = condition;
    }
    
    
    public String getCondition() {
        return condition;
    }
    
    
    @Override
    public String toString() {
        return getCity() + ' ' + getCurrentTemperature() + " ºC" + ' ' + condition;
    }
}
