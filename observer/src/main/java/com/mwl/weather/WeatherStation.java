package com.mwl.weather;

import com.mwl.util.Print;

/**
 * @author mawenlong
 * @date 2018/11/06
 */
public class WeatherStation {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
    weatherData.setMeasurements(80, 65, 30.4f);
    Print.separator();
    weatherData.setMeasurements(82, 70, 29.2f);
    Print.separator();
    weatherData.setMeasurements(78, 90, 29.2f);
  }
}
