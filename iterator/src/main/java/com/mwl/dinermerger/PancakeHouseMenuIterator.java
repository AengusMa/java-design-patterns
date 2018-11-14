package com.mwl.dinermerger;

import java.util.ArrayList;

/**
 * @author mawenlong
 * @date 2018/11/14
 */
public class PancakeHouseMenuIterator implements Iterator {

  private ArrayList<MenuItem> items;
  private int position = 0;

  public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
    this.items = items;
  }

  public MenuItem next() {
    MenuItem item = items.get(position);
    position = position + 1;
    return item;
  }

  public boolean hasNext() {
    if (position >= items.size()) {
      return false;
    } else {
      return true;
    }
  }
}
