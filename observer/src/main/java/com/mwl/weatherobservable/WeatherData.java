package com.mwl.weatherobservable;

import java.util.Observable;

/**
 * @author mawenlong
 * @date 2018/11/07
 */
public class WeatherData extends Observable {

  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
  }

  public void measurementsChanged() {
    setChanged();
    notifyObservers();
  }

  public void setMeasurementsChanged(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }
}
