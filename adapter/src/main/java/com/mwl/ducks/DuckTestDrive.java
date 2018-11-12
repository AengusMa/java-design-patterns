package com.mwl.ducks;

import com.mwl.ducks.duck.Duck;
import com.mwl.ducks.duck.MallardDuck;
import com.mwl.ducks.turkey.TurkeyAdapter;
import com.mwl.ducks.turkey.WildTurkey;

public class DuckTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();

		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();

		System.out.println("\nThe Duck says...");
		testDuck(duck);

		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
