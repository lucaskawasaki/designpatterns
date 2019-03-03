package facade.controller;

import facade.domain.Amplifier;
import facade.domain.CdPlayer;
import facade.domain.DvdPlayer;
import facade.domain.PopcornPopper;
import facade.domain.Projector;
import facade.domain.Screen;
import facade.domain.TheaterLights;
import facade.domain.Tuner;

public class HomeTheaterFacade {

	private Amplifier amplifier;
	private Tuner tuner;
	private DvdPlayer dvdPlayer;
	private CdPlayer cdPlayer;
	private Projector projector;
	private TheaterLights lights;
	private Screen screen;
	private PopcornPopper popper;


	public HomeTheaterFacade(Amplifier ampliefier,
							 Tuner tuner,
							 DvdPlayer dvdPlayer,
							 CdPlayer cdPlayer,
							 Projector projector,
							 TheaterLights theaterLights,
							 Screen screen,
							 PopcornPopper popper) {
		this.amplifier = ampliefier;
		this.tuner = tuner;
		this.dvdPlayer = dvdPlayer;
		this.cdPlayer = cdPlayer;
		this.projector = projector;
		this.lights = theaterLights;
		this.screen = screen;
		this.popper = popper;
	}

	public void watchMovie(String movie)
	{
		System.out.println("Get ready to watch a movie...");
		this.popper.on();
		this.popper.pop();
		this.lights.dim(10);
		this.screen.down();
		this.projector.on();
		this.projector.wideScreenMode();
		this.amplifier.on();
		this.amplifier.setDvd(this.dvdPlayer);
		this.amplifier.setSurrondSound();
		this.amplifier.setVolume(5);
		this.dvdPlayer.on();
		this.dvdPlayer.play(movie);
	}

	public void endMovie() {
		System.out.println("Shutting movie theater down...");
		this.popper.off();
		this.lights.on();
		this.screen.up();
		this.projector.off();
		this.amplifier.off();
		this.dvdPlayer.stop();
		this.dvdPlayer.eject();
		this.dvdPlayer.off();
	}

}
