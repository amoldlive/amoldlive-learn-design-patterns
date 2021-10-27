package facade;

import java.time.LocalDate;

public class VacationClientMain {
	public static void main(String[] args) {
		
		LocalDate startDate=LocalDate.of(2021, 8, 11);
		LocalDate stopDate=LocalDate.of(2021, 8, 31);

		
		
		 // System.out.println("Banglore - Pune Booking Started **** \n");
		  
		 // Flight flight = new Flight("Vistara - Banglore - Pune");
		 // flight.bookJourney(startDate, stopDate);
		  
		  //Hotel hotel=new Hotel("Redisson Blue - Pune"); 
		 //  hotel.book(startDate,stopDate);
		  
		 // FoodPackage foodPackage=new FoodPackage("All- Buffet - Family");
		  //foodPackage.bookFoodPackage(startDate, stopDate);
		  
		  //Vehical vehical=new Vehical("Ola - scooter - 1x-100");
		  //vehical.book(startDate, stopDate);
		  
		  //System.out.println("\nBanglore - Pune Booking Completed **** ");
		 

			/**
			 * Lets simplify above facade
			 */
		
		VacationClientFacade clientFacade=new VacationClientFacade();
		clientFacade.bookBanglorePuneVacation(startDate, stopDate);
		
		
	}

}
