package decorator;

public class AppRunnerMain {

	public static void main(String[] args) {
		
		Coffee coffee=new Expresso();
		
		//1x milk
		coffee=new WithMilk(coffee);
		
		//2x sugar
		coffee=new WithSugar(coffee);
		coffee=new WithSugar(coffee);
		
		System.out.println("Description : "+ coffee.getDescription());
		System.out.println("Cost : "+ coffee.getCost());
		
	}
}
