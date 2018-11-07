package com.mwl.weatherobservable;

import com.mwl.util.Print;


/**
 * @author mawenlong
 * @date 2018/11/07
 */
public class WeatherStation {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
    weatherData.setMeasurementsChanged(80, 65, 30.4f);
    Print.separator();
    weatherData.setMeasurementsChanged(82, 70, 29.2f);
    Print.separator();
    weatherData.setMeasurementsChanged(78, 90, 29.2f);
  }
}
