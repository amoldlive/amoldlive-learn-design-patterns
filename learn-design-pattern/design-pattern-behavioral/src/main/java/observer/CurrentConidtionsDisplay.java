package observer;

public class CurrentConidtionsDisplay implements Observer {

	private int humidity;
	private int temprature;

	public CurrentConidtionsDisplay(Subject workstation) {
		workstation.registerObserver(this);
	}

	@Override
	public void update(int humidity, int temprature) {
		this.humidity = humidity;
		this.temprature = temprature;
		display();
	}

	public void display() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "CurrentConidtionsDisplay -> [humidity=" + humidity + ", temprature=" + temprature + "]";
	}

}
