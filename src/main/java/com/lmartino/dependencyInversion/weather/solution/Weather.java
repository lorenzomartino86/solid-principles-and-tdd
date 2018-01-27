package com.lmartino.dependencyInversion.weather.solution;

/**
 * Created by lore on 27/01/18.
 */
public class Weather {

    private WeatherApi1 weatherApi1;
    private WeatherApi2 weatherApi2;

    public Weather(WeatherApi1 weatherApi1, WeatherApi2 weatherApi2) {
        this.weatherApi1 = weatherApi1;
        this.weatherApi2 = weatherApi2;
    }


    public double getTemperature() {
        return (weatherApi1.getTemperatureCelcius() + toCelcius(weatherApi2.getTemperatureFahrenheit())) / 2;
    }

    private double toCelcius(double temperatureFahrenheit) {
        return (temperatureFahrenheit - 32) / 1.8f;
    }
}
