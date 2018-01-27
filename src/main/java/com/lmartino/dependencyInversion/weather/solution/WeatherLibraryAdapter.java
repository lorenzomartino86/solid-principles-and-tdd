package com.lmartino.dependencyInversion.weather.solution;

/**
 * Created by lore on 27/01/18.
 *
 * This is an adapter class that implements WeatherSource and use the WeatherLibrary internally.
 * Using composition to protect our Weather class from being dependent on WeatherLibray
 * It's the library that serves the architecture, not the other way around!
 *
 */
public class WeatherLibraryAdapter implements WeatherSource {

    private WeatherLibrary weatherLibrary;

    public WeatherLibraryAdapter(WeatherLibrary weatherLibrary) {
        this.weatherLibrary = weatherLibrary;
    }

    @Override
    public double getTemperatureCelcius() {
        return toCelcius(weatherLibrary.getTemperatureFahrenheit());
    }

    private double toCelcius(double temperatureFahrenheit) {
        return (temperatureFahrenheit - 32) / 1.8f;
    }
}
