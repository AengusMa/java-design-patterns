package com.mwl.sort;

/**
 * @author mawenlong
 * @date 2018/11/12
 *
 * 可以排序的鸭子
 */
public class Duck implements Comparable<Duck> {

  private String name;
  private int weight;

  public Duck(String name, int weight) {
    this.name = name;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return name + " weighs " + weight;
  }

  @Override
  public int compareTo(Duck object) {

    Duck otherDuck = object;

    if (this.weight < otherDuck.weight) {
      return -1;
    } else if (this.weight == otherDuck.weight) {
      return 0;
    } else {
      return 1;
    }
  }
}
