package com.mwl.weather;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mawenlong
 * @date 2018/11/06
 */
public class WeatherData implements Subject {

  private List<Observer> observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
    this.observers = new ArrayList();
  }

  public void registerObserver(Observer o) {
    observers.add(o);
  }

  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(temperature, humidity, pressure);
    }
  }

  /**
   * 从气象站获得到信息时，会调用此方法
   */
  public void measurementsChanged() {
    notifyObservers();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }
}
