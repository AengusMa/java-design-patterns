package com.mwl.weatherobservable;

import com.mwl.weather.DisplayElement;
import java.util.Observable;
import java.util.Observer;

/**
 * @author mawenlong
 * @date 2018/11/07
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

  private Observable observable;
  private float temperature;
  private float humidity;
  private float pressure;

  public CurrentConditionsDisplay(Observable observable) {
    this.observable = observable;
    this.observable.addObserver(this);
  }

  public void display() {
    System.out.println(
        "Current conditions:\n\t temperature: " + temperature + "F degerees \n\t humidity:"
            + humidity
            + "% \n\t pressure:" + pressure);
  }

  public void update(Observable o, Object arg) {
    if (o instanceof WeatherData) {
      WeatherData weatherData = (WeatherData) o;
      this.temperature = weatherData.getTemperature();
      this.humidity = weatherData.getHumidity();
      this.pressure = weatherData.getPressure();
      display();
    }
  }
}
