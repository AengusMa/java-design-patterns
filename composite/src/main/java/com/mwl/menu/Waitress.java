package com.mwl.menu;

/**
 * @author mawenlong
 * @date 2018/11/15
 */
public class Waitress {
    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
