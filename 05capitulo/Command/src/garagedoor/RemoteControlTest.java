package garagedoor;

public class RemoteControlTest {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorCommand garageOpen = new GarageDoorCommand(garageDoor);

		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
	}

}
