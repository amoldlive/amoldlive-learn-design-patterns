package observer;

import java.util.ArrayList;

/**
 * 
 * @author Amol D
 *
 */
public class WeatherStation implements Subject {

	private ArrayList<Observer> observerList;
	private int humidity;
	private  int temprature;

	public WeatherStation() {
		observerList = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observerList.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		int index = observerList.indexOf(observer);

		if (index >= 0) {
			observerList.remove(index);
		}
	}

	@Override
	public void notifyObserver() {
		observerList.forEach(o->o.update(humidity, temprature));
	}

	public void updateWeatherDetails(int humidity , int temprature) {
		this.humidity=humidity;
		this.temprature=temprature;
		notifyObserver();
	}
}
