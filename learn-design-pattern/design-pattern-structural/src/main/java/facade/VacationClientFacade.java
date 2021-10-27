package facade;

import java.time.LocalDate;

public class VacationClientFacade {


	public void bookBanglorePuneVacation(LocalDate startDate, LocalDate stopDate) {

		System.out.println("Banglore - Pune Booking Started **** \n");

		Flight flight = new Flight("Vistara - Banglore - Pune");
		flight.bookJourney(startDate, stopDate);

		Hotel hotel = new Hotel("Redisson Blue - Pune");
		hotel.book(startDate, stopDate);

		FoodPackage foodPackage = new FoodPackage("All- Buffet - Family");
		foodPackage.bookFoodPackage(startDate, stopDate);

		Vehical vehical = new Vehical("Ola - scooter - 1x-100");
		vehical.book(startDate, stopDate);

		System.out.println("\nBanglore - Pune Booking Completed **** ");

	}

}
