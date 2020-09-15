package service;


import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonObject;
import widget.HtmlWeatherWidget;
import widget.WeatherWidget;

import java.io.IOException;
import java.net.URISyntaxException;


public class HtmlWeatherWidgetService extends WeatherWidgetService {
    @Override
    public WeatherWidget createWeatherWidget(String city) throws IOException, URISyntaxException {
        String currentWeatherJson = weatherDao.getCurrentWeatherJson(city);
        JsonObject currentWeatherJsonObject = Json.parse(currentWeatherJson).asObject();
        HtmlWeatherWidget weatherWidget = new HtmlWeatherWidget();
        
        weatherWidget.setCity(city);
        weatherWidget.setCurrentTemperature(currentWeatherJsonObject.get("main").asObject().get("temp").asDouble());
        weatherWidget.setWidgetBorderColor("#888");
        weatherWidget.setCityColor("#fc0");
        weatherWidget.setTemperatureColor("#ffffe0");
        
        return weatherWidget;
    }
}
