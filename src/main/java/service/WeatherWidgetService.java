package service;


import dao.OpenWeatherMapDao;
import dao.WeatherDao;
import widget.WeatherWidget;

import java.io.IOException;
import java.net.URISyntaxException;


public abstract class WeatherWidgetService {
    public static WeatherDao weatherDao = new OpenWeatherMapDao("9b784d72d3912029459eec61a320286e");
    
    
    public abstract WeatherWidget createWeatherWidget(String city) throws IOException, URISyntaxException;
    
    
    public String getWeatherWidgetString(String city) throws URISyntaxException, IOException {
        return createWeatherWidget(city).toString();
    }
}
