package decorator;

public class WithSugar extends CoffeeDecorator {


	public WithSugar(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {
		return coffee.getCost() + 05.0;
	}

	@Override
	public String getDescription() {
		return coffee.getDescription() + " + Sugar ";
	}
}
