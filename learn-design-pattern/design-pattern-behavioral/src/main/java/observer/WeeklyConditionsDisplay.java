package observer;

import java.util.ArrayList;

public class WeeklyConditionsDisplay implements Observer {

	private ArrayList<Integer> humidityList;
	private ArrayList<Integer> tempratureList;

	public WeeklyConditionsDisplay(Subject weatherStation) {
		humidityList=new ArrayList<>();
		tempratureList=new ArrayList<>();
		
		weatherStation.registerObserver(this);
	}

	@Override
	public void update(int humidity, int temprature) {
		humidityList.add(humidity);
		tempratureList.add(temprature);
		display();
	}

	@Override
	public void display() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "WeeklyConditionsDisplay -> [humidityList=" + humidityList + ", tempratureList=" + tempratureList + "]";
	}

}
