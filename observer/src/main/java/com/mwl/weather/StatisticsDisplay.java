package com.mwl.weather;

/**
 * @author mawenlong
 * @date 2018/11/06
 *
 * 统计布告版
 */
public class StatisticsDisplay implements Observer, DisplayElement {

  private WeatherData weatherData;
  private float maxTemp = 0.0f;
  private float minTemp = 0.0f;
  private float tempSum = 0.0f;
  private int numReadings;

  public StatisticsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    this.weatherData.registerObserver(this);
  }

  public void display() {
    System.out.println(
        "Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
  }

  public void update(float temp, float humidity, float pressure) {
    tempSum += temp;
    numReadings++;
    if (temp > maxTemp) {
      maxTemp = temp;
    }
    if (temp < minTemp) {
      minTemp = temp;
    }
    display();
  }
}
