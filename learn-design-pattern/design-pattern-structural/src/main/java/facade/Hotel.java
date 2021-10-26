package facade;

import java.time.LocalDate;

public class Hotel {
	private String hotelName;

	public Hotel(String hotelName) {
		super();
		this.hotelName = hotelName;
	}

	public void book(LocalDate startDate, LocalDate stopDate) {
		System.out.println("Hotel : " + hotelName + " Bokked From " + startDate + "  to  " + stopDate);
	}
}
