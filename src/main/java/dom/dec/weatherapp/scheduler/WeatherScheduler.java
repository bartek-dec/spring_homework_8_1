package dom.dec.weatherapp.scheduler;

import dom.dec.weatherapp.client.WeatherClient;
import dom.dec.weatherapp.domain.Temperature;
import dom.dec.weatherapp.domain.TemperatureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class WeatherScheduler {
    private WeatherClient client;
    private TemperatureRepo temperatureRepo;

    @Autowired
    public WeatherScheduler(WeatherClient client, TemperatureRepo temperatureRepo) {
        this.client = client;
        this.temperatureRepo = temperatureRepo;
    }

    @Scheduled(fixedDelay = 3600000)
    public void saveTemp() {
        Temperature temp = new Temperature(client.getTemp());
        temperatureRepo.save(temp);
    }
}
