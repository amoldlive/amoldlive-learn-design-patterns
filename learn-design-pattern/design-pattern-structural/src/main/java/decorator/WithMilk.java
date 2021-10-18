package decorator;

public class WithMilk extends CoffeeDecorator {


	public WithMilk(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {
		return coffee.getCost() + 10.0;
	}

	@Override
	public String getDescription() {
		return coffee.getDescription() + "+ Milk ";
	}
}
