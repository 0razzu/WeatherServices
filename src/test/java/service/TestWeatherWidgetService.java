package service;


import util.HttpUtils;

import java.io.IOException;
import java.net.URISyntaxException;


public class TestWeatherWidgetService {
    public static void main(String[] args) throws IOException, URISyntaxException {
        WeatherWidgetService service1 = new ConsoleWeatherWidgetService();
        
        System.out.println("*** CONSOLE WIDGETS ***");
        System.out.println(service1.getWeatherWidgetString("Omsk"));
        System.out.println(service1.getWeatherWidgetString("Saint Petersburg"));
        System.out.println(service1.getWeatherWidgetString("Baghdad"));
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        WeatherWidgetService service2 = new HtmlWeatherWidgetService();
        
        System.out.println("*** HTML WIDGETS ***");
        System.out.println(service2.getWeatherWidgetString("Omsk"));
        System.out.println(service2.getWeatherWidgetString("Saint Petersburg"));
        System.out.println(service2.getWeatherWidgetString("Baghdad"));
        
        HttpUtils.closeClient();
    }
}
