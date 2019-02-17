package adapter.turkey;

import adapter.duck.Duck;

public class TurkeyAdapter implements Turkey {

	private Duck duck;

	public TurkeyAdapter(Duck duck) {
		this.duck = duck;
	}

	@Override
	public void gobble() {
		this.duck.quack();
	}

	@Override
	public void fly() {
		this.duck.fly();
	}

}
