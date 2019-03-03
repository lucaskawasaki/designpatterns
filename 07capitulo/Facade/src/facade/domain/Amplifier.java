package facade.domain;

public class Amplifier {

	public void setDvd(DvdPlayer dvdPlayer) {
		System.out.println("Top-O-Line Amplifier setting DVD player to Top-O-Line DVD Player");

	}

	public void on() {
		System.out.println("Top-O-Line Amplifier on");
	}

	public void setSurrondSound() {
		System.out.println("Top-O-Line Amplifier surrond sound on (5 speakers, 1 subwoofer)");
	}

	public void setVolume(int volume) {
		System.out.printf("Top-O-Line Ampliefier setting volume to %d %n", volume);
	}

	public void off() {
		System.out.println("Top-O-Line Amplifier off");
	}

}
