package garagedoor;

public abstract class Vendedor{

	String nome;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void on(){
		System.out.println(nome +" "+ onHook());
	}
	
	public abstract String onHook();
	
	public void off(){
		System.out.println(nome +" "+ offHook());
	}	

	public abstract String offHook();
	
}
