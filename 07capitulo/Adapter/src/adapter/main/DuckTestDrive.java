package adapter.main;

import adapter.duck.Duck;
import adapter.duck.DuckAdapter;
import adapter.duck.MallardDuck;
import adapter.turkey.Turkey;
import adapter.turkey.TurkeyAdapter;
import adapter.turkey.WildTurkey;

public class DuckTestDrive {

	public static void main(String[] args) {

		MallardDuck mallardDuck = new MallardDuck();
		WildTurkey wildTurkey = new WildTurkey();

		System.out.println("Duck says... ");
		testDuck(mallardDuck);

		System.out.println("\nTurkey says... ");
		testTurkey(wildTurkey);

		System.out.println("\nDuckAdapter says... ");
		DuckAdapter duckAdapter = new DuckAdapter(wildTurkey);
		testDuck(duckAdapter);

		System.out.println("\n TurkeyAdapter says... ");
		TurkeyAdapter turkeyAdapter = new TurkeyAdapter(mallardDuck);
		testTurkey(turkeyAdapter);

	}

	static void testDuck(Duck duck)
	{
		duck.quack();
		duck.fly();
	}

	static void testTurkey(Turkey turkey)
	{
		turkey.gobble();
		turkey.fly();
	}

}
