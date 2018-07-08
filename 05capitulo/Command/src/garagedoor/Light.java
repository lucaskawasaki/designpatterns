package garagedoor;

public class Light extends Vendedor{
	
	public Light(String name) {
		super.setNome(name);
	}
	
	@Override
	public String onHook() {
		return "Luz ligada!!!";
	}

	@Override
	public String offHook() {
		return "Luz desligada!!!";
	}

}
