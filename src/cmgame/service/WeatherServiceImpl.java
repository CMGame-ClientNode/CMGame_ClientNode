package cmgame.service;

public class WeatherServiceImpl implements WeatherService {

    public WeatherReport getCurrentWeather() {
        return new WeatherReport();
    }
}
