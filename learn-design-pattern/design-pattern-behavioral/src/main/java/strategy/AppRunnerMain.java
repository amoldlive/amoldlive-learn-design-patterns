package strategy;

public class AppRunnerMain {
	public static void main(String[] args) {

		MathStrategyBehaviour behaviour1 = new MathStrategyBehaviour(new Addition());
		behaviour1.performTask(4, 5);

		MathStrategyBehaviour behaviour2 = new MathStrategyBehaviour(new Substraction());
		behaviour2.performTask(4, 5);
		
		MathStrategyBehaviour behaviour3 = new MathStrategyBehaviour(new Multiplication());
		behaviour3.performTask(4, 5);
	}
}
