package dao;


import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.util.EntityUtils;
import util.HttpUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class OpenWeatherMapDao implements WeatherDao {
    private final String ID;
    
    
    public OpenWeatherMapDao(String id) {
        ID = id;
    }
    
    
    @Override
    public String getCurrentWeatherJson(String city) throws URISyntaxException, IOException {
        URI uri = new URIBuilder()
                .setScheme("http")
                .setHost("api.openweathermap.org")
                .setPath("/data/2.5/weather")
                .setParameter("q", city)
                .setParameter("appid", ID)
                .setParameter("units", "metric")
                .build();
        HttpUriRequest httpGet = new HttpGet(uri);
        
        try (CloseableHttpResponse response = HttpUtils.getClient().execute(httpGet)) {
            return EntityUtils.toString(response.getEntity());
        }
    }
}
