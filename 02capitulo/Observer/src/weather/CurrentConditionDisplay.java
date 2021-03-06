package weather;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Observable observable;
	
	public CurrentConditionDisplay(Observable weatherData) {
		this.observable = weatherData;
		this.observable.addObserver(this);		
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions "+temperature+" F degrees"
				+ " and "+humidity+"% humidity");

	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData) o;
			humidity = weatherData.getHumidity();
			temperature = weatherData.getTemperature();
			display();
		}
		
	}

}
