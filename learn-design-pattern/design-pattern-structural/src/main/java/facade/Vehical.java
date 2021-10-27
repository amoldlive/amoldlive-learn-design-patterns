package facade;

import java.time.LocalDate;

public class Vehical {
	private String vehicalName;

	public Vehical(String vehicalName) {
		super();
		this.vehicalName = vehicalName;
	}

	public void book(LocalDate startDate, LocalDate stopDate) {
		System.out.println("Vehical : " + vehicalName + " Bokked From " + startDate + "  to  " + stopDate);
	}
}
