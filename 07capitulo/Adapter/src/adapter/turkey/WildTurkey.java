package adapter.turkey;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("Gobble google");

	}

	@Override
	public void fly() {
		System.out.println("I'm flying a short distance");

	}

}
