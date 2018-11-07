package com.mwl.weather;

public interface Observer {

  /**
   * 更新温度，湿度，压力
   */
  void update(float temp, float humidity, float pressure);
}
