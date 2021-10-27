package strategy;

public class Addition implements MathStrategy {

	@Override
	public int calculation(int num1, int num2) {
		return num1 + num2;
	}

}
