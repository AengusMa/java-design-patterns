package com.mwl.hometheater.facade;

/**
 * @author mawenlong
 * @date 2018/11/11
 */
public class Screen {

  private String description;

  public Screen(String description) {
    this.description = description;
  }

  public void up() {
    System.out.println(description + " going up");
  }

  public void down() {
    System.out.println(description + " going down");
  }


  @Override
  public String toString() {
    return description;
  }
}
