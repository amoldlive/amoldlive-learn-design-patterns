package decorator;

public class Regular extends Coffee {

	@Override
	public String getDescription() {
		return "Regular Coffee ";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 05.0;
	}
}
