package adapter;

public class HondaIndia implements IndianPriceCalculator {
	private double price;
	
	HondaIndia(){
		price=20000.00;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String calculatePrice() {
		return "Rs. "+getPrice();
	}

}
