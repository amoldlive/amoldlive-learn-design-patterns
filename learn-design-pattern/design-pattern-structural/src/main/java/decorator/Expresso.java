package decorator;

public class Expresso extends Coffee {

	@Override
	public String getDescription() {
		return " Expresso coffee ";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 10.0;
	}
}
