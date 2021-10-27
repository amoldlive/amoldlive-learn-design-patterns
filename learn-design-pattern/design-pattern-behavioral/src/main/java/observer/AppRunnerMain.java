package observer;

import java.util.Random;

/*	[ Publisher + Subscriber = Observer Pattern ]  
 * 	when the state of one main object changes , all of its dependents are notified 
 *	
 *	@author Amol D 
 */
public class AppRunnerMain {
	public static void main(String[] args) {
		Random random = new Random();

		/*Behaviour*/
		WeatherStation weatherStation = new WeatherStation();

		Observer currentConditionDisplay = new CurrentConidtionsDisplay(weatherStation);
		Observer weeklyConditionDisplay = new WeeklyConditionsDisplay(weatherStation);

		for (int i = 1; i <= 5; i++) {
			System.out.println("Update -> " + i);
			weatherStation.updateWeatherDetails(random.nextInt(100), random.nextInt(100));
		}
	}
}
