package com.mwl.ducks;

import com.mwl.ducks.adapter.Goose;
import com.mwl.ducks.adapter.GooseAdapter;
import com.mwl.ducks.composite.Flock;
import com.mwl.ducks.decorator.QuackCounter;
import com.mwl.ducks.duck.DuckCall;
import com.mwl.ducks.duck.MallardDuck;
import com.mwl.ducks.duck.Quackable;
import com.mwl.ducks.duck.RedheadDuck;
import com.mwl.ducks.duck.RubberDuck;
import com.mwl.ducks.factory.AbstractDuckFactory;
import com.mwl.ducks.factory.CountingDuckFactory;
import com.mwl.ducks.observer.Quackologist;

/**
 * @author mawenlong
 * @date 2018/11/17
 *
 * 鸭子模拟器
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
        simulator.simulate();
    }

    public void simulate(AbstractDuckFactory duckFactory) {

        System.out.println("\n鸭子模拟器");
        Flock flockOfDucks = new Flock();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);


        Flock flockOfMallards = new Flock();
        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);
        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: With Observer");

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        simulate(flockOfDucks);

        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockOfDucks);

        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        simulate(flockOfMallards);

        System.out.println("\nThe ducks quacked " +
                QuackCounter.getQuacks() +
                " times");
    }

    public void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\n鸭子模拟器");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("鸭子叫了 " + QuackCounter.getQuacks() + " 鸭子叫了");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
