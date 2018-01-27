package com.lmartino.dependencyInversion.weather.solution;

/**
 * Created by lore on 27/01/18.
 */
public class WeatherApi2 implements WeatherSource{
    public double getTemperatureCelcius() {
        return toCelcius(getTemperatureFahrenheit());
    }

    private double getTemperatureFahrenheit(){
        return 0;
    }

    private double toCelcius(double temperatureFahrenheit) {
        return (temperatureFahrenheit - 32) / 1.8f;
    }

}
