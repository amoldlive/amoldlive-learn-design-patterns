package decorator;

public abstract class CoffeeDecorator extends Coffee {

	protected Coffee coffee;

	public CoffeeDecorator(Coffee coffee) {
		this.coffee = coffee;
	}

	public abstract double getCost();

}
