package dom.dec.weatherapp.client;

import dom.dec.weatherapp.model.Weather;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherClient {

    @Value("${baseUrl}")
    private String baseUrl;

    private RestTemplate restTemplate;

    public WeatherClient() {
        this.restTemplate = new RestTemplate();
    }

    public double getTemp() {
        Weather weather = restTemplate.getForObject(baseUrl, Weather.class);
        return weather.getCurrent().getTempC();
    }
}
