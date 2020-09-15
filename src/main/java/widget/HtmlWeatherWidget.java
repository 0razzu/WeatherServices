package widget;


public class HtmlWeatherWidget extends WeatherWidget {
    private String widgetBorderColor;
    private String cityColor;
    private String temperatureColor;
    
    
    public HtmlWeatherWidget() {
        super();
        
        widgetBorderColor = "#000";
        cityColor = "#fff";
        temperatureColor = "#fff";
    }
    
    
    public void setWidgetBorderColor(String widgetBorderColor) {
        this.widgetBorderColor = widgetBorderColor;
    }
    
    
    public void setCityColor(String cityColor) {
        this.cityColor = cityColor;
    }
    
    
    public void setTemperatureColor(String temperatureColor) {
        this.temperatureColor = temperatureColor;
    }
    
    
    public String getWidgetBorderColor() {
        return widgetBorderColor;
    }
    
    
    public String getCityColor() {
        return cityColor;
    }
    
    
    public String getTemperatureColor() {
        return temperatureColor;
    }
    
    
    @Override
    public String toString() {
        return "<style type=\"text/css\">\n" +
                "    #weather-widget {\n" +
                "        border: solid 1px " + widgetBorderColor + ";\n" +
                "        display: inline-block\n" +
                "    }\n" +
                "\n" +
                "    #city { \n" +
                "        width: 10em; \n" +
                "        background: " + cityColor + ";\n" +
                "        padding: 5px;\n" +
                "        float: left\n" +
                "    }\n" +
                "\n" +
                "    #temperature { \n" +
                "        width: 3em;\n" +
                "        background: " + temperatureColor + "; \n" +
                "        padding: 5px;\n" +
                "        float: right\n" +
                "    }\n" +
                "</style>\n" +
                "\n" +
                "\n" +
                "<div id='weather-widget'>\n" +
                "    <div id='city'>" + getCity() + "</div>\n" +
                "    <div id='temperature'>" + getCurrentTemperature() + " ºC</div>\n" +
                "</div>";
    }
}
