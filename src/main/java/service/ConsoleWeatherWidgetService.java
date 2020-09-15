package service;


import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonObject;
import widget.ConsoleWeatherWidget;
import widget.WeatherWidget;

import java.io.IOException;
import java.net.URISyntaxException;


public class ConsoleWeatherWidgetService extends WeatherWidgetService {
    @Override
    public WeatherWidget createWeatherWidget(String city) throws IOException, URISyntaxException {
        String currentWeatherJson = weatherDao.getCurrentWeatherJson(city);
        JsonObject currentWeatherJsonObject = Json.parse(currentWeatherJson).asObject();
        ConsoleWeatherWidget weatherWidget = new ConsoleWeatherWidget();
        
        weatherWidget.setCity(city);
        weatherWidget.setCurrentTemperature(currentWeatherJsonObject.get("main").asObject().get("temp").asDouble());
        weatherWidget.setCondition(currentWeatherJsonObject.get("weather").asArray().get(0).asObject().get("main").asString());
        
        return weatherWidget;
    }
}
