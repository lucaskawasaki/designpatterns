package garagedoor;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtomWasPushed(0);
		remoteControl.offButtonWasPushed(0);

	}

}
