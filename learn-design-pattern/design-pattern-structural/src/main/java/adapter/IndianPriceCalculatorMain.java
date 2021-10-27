package adapter;

public class IndianPriceCalculatorMain {
	public static void main(String[] args) {
		
		HondaIndia hondaIndia=new HondaIndia();
		printPrice(hondaIndia);
	
		SuzukiIndia suzukiIndia=new SuzukiIndia();
		printPrice(suzukiIndia);
		
		/*non indian Bike*/
		HarleyDavidsonUS harleyDavidsonUS=new HarleyDavidsonUS(4000, "X-1005cc");
		// printPrice(harleyDavidsonUS);  // not supported
		
		//create adapter for non indian bikes
		HarleyDavidsonAdapter harleyDavidsonAdapter=new HarleyDavidsonAdapter(harleyDavidsonUS);
		printPrice(harleyDavidsonAdapter);
		
 		
	}

	private static void printPrice(IndianPriceCalculator indianPriceCalculator) {
		System.out.println(
				indianPriceCalculator.getClass().getSimpleName() + "  -  " + indianPriceCalculator.calculatePrice());
	}
}
