package facade.view;

import facade.controller.HomeTheaterFacade;
import facade.domain.Amplifier;
import facade.domain.CdPlayer;
import facade.domain.DvdPlayer;
import facade.domain.PopcornPopper;
import facade.domain.Projector;
import facade.domain.Screen;
import facade.domain.TheaterLights;
import facade.domain.Tuner;

public class HomeTheaterTestDrive {

	public static void main(String[] args) {

		Amplifier ampliefier = new Amplifier();
		Tuner tuner = new Tuner();
		DvdPlayer dvdPlayer = new DvdPlayer();
		CdPlayer cdPlayer = new CdPlayer();
		Projector projector = new Projector();
		TheaterLights theaterLights = new TheaterLights();
		Screen screen = new Screen();
		PopcornPopper popper = new PopcornPopper();

		HomeTheaterFacade homeTheater = new HomeTheaterFacade(ampliefier,
															  tuner,
															  dvdPlayer,
															  cdPlayer,
															  projector,
															  theaterLights,
															  screen,
															  popper);

		homeTheater.watchMovie("Raider of the Lost Ark");
		homeTheater.endMovie();

	}

}
