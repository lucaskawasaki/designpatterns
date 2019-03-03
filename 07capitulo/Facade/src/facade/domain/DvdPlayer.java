package facade.domain;

public class DvdPlayer {

	private String movie;

	public void on() {
		System.out.println("Top-O-Line DVD Player on");

	}

	public void play(String movie) {
		this.movie = movie;
		System.out.println("Top-O-Line DVD Playe playing \"" + this.movie + "\"");

	}

	public void stop() {
		System.out.println("Top-O-Line DVD Player stopped \"" + movie + "\"");
	}

	public void off() {
		System.out.println("Top-O-Line DVD player off");
	}

	public void eject() {
		System.out.println("Top-O-Line DVD player eject");
	}

}
