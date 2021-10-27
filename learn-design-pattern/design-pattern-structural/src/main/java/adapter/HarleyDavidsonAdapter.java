package adapter;

public class HarleyDavidsonAdapter implements IndianPriceCalculator{

	HarleyDavidsonUS harleyDavidsonUS;
	
	public HarleyDavidsonAdapter(HarleyDavidsonUS harleyDavidsonUS) {
		super();
		this.harleyDavidsonUS = harleyDavidsonUS;
	}



	@Override
	public String calculatePrice() {
		// TODO Auto-generated method stub
		return "Rs. "+ (70*harleyDavidsonUS.getPrice());
	}

}
