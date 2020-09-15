package dao;


import java.io.IOException;
import java.net.URISyntaxException;


public interface WeatherDao {
    String getCurrentWeatherJson(String city) throws URISyntaxException, IOException;
}
