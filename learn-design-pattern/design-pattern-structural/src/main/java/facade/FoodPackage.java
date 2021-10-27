package facade;

import java.time.LocalDate;

public class FoodPackage {
	private String foodPackageName;

	public FoodPackage(String foodPackageName) {
		super();
		this.foodPackageName = foodPackageName;
	}
	
	public void bookFoodPackage(LocalDate startDate, LocalDate stopDate) {
		System.out.println("FoodPackage : " + foodPackageName + " Booked From " + startDate + "  to  " + stopDate);
	}

	
}
