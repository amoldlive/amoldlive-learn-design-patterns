package strategy;

public class MathStrategyBehaviour {

	MathStrategy mathStrategy;

	public MathStrategyBehaviour(MathStrategy mathStrategy) {
		this.mathStrategy = mathStrategy;
	}

	public void performTask(int num1, int num2) {
		int result =mathStrategy.calculation(num1, num2);
		System.out.println("MathStrategy : "+mathStrategy +  " Result : "+result);
	}
}
