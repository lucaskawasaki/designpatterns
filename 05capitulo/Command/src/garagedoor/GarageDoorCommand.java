package garagedoor;

public class GarageDoorCommand implements Command {

	private GarageDoor garage;
	
	public GarageDoorCommand(GarageDoor garage) {
		this.garage = garage;
	}
	
	@Override
	public void execute() {
		garage.up();
		garage.lightOn();
		garage.lightOff();
		garage.down();
		garage.stop();
	}

}
