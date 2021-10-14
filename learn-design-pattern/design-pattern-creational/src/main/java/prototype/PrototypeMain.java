package prototype;

public class PrototypeMain {
	public static void main(String[] args) {
		Rabbit rabbit = new Rabbit();
		rabbit.setOwner("Sally");
		Rabbit rabbitCopy = rabbit.clone();
		System.out.println("Name of first owner " + rabbit.getOwner().getName());
		System.out.println("Name of cloned owner " + rabbitCopy.getOwner().getName());

		/*changing mutable object data for cloned object*/
		rabbitCopy.getOwner().setName("Steve");
		
		System.out.println("after change>> Name of first owner " + rabbit.getOwner().getName());
		System.out.println("after change>> Name of cloned owner " + rabbitCopy.getOwner().getName());

	}
}
