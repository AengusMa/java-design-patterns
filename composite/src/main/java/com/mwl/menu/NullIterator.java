package com.mwl.menu;

import java.util.Iterator;

/**
 * @author mawenlong
 * @date 2018/11/15
 */
public class NullIterator  implements Iterator<MenuComponent> {
    public MenuComponent next() {
        return null;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public boolean hasNext() {
        return false;
    }
}
