package com.mwl.ducks.adapter;

import com.mwl.ducks.duck.Quackable;

/**
 * @author mawenlong
 * @date 2018/11/17
 *
 * 适配器模式
 */
public class GooseAdapter implements Quackable {
    //适配的对象
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    public void quack() {
        goose.honk();
    }

    @Override
    public String toString() {
        return "Goose pretending to be a Duck";
    }
}
