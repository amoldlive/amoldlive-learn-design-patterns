package adapter;

public class SuzukiIndia implements IndianPriceCalculator {
	private double price;
	
	SuzukiIndia(){
		price=50000.00;
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
