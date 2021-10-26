package adapter;

public class HarleyDavidsonUS {
	int price;
	String model;

	public HarleyDavidsonUS(int price, String model) {
		super();
		this.price = price;
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
