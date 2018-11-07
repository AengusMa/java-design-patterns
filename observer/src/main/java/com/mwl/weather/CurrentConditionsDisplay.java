package com.mwl.weather;

/**
 * @author mawenlong
 * @date 2018/11/06
 *
 * 目前状态布告板
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

  private float temperature;
  private float humidity;
  private float pressure;
  private Subject weatherData;

  public CurrentConditionsDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    this.weatherData.registerObserver(this);
  }

  public void display() {
    System.out.println(
        "Current conditions:\n\t temperature: " + temperature + "F degerees \n\t humidity:" + humidity
            + "% \n\t pressure:" + pressure);
  }

  public void update(float temp, float humidity, float pressure) {
    this.temperature = temp;
    this.humidity = humidity;
    this.pressure = pressure;
    display();
  }
}
