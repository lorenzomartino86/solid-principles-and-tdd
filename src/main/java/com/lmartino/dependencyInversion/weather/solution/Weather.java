package com.lmartino.dependencyInversion.weather.solution;

import java.util.List;

/**
 * Created by lore on 27/01/18.
 */
public class Weather {

    private List<WeatherSource> weatherSources;

    public Weather(List<WeatherSource> weatherSources) {
        this.weatherSources = weatherSources;
    }

    public double getTemperature() {
        return weatherSources.stream().mapToDouble(WeatherSource::getTemperatureCelcius).average().getAsDouble();
    }

}
