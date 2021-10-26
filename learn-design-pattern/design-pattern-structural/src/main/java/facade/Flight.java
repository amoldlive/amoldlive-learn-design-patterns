package facade;

import java.time.LocalDate;

public class Flight {
	
	private String flightName;

	public Flight(String flightName) {
		super();
		this.flightName = flightName;
	}

	public void bookJourney(LocalDate startDate, LocalDate stopDate) {
		System.out.println("Flight : " + flightName + " Booked From " + startDate + "  to  " + stopDate);
	}
}
