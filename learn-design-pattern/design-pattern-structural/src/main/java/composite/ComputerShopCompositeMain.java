package composite;

public class ComputerShopCompositeMain {
	public static void main(String[] args) {
		Mouse mouse = new Mouse("Mouse", 690);
		printPrice(mouse);

		KeyBoard keyBoard = new KeyBoard("KeyBoard", 1094);
		printPrice(keyBoard);
		
		HardDisk hardDisk=new HardDisk("Hard Disk", 5000);
		printPrice(hardDisk);
	}

	public static void printPrice(ComputerSpare computerSpare) {
		System.out.println("Spare Name : " + computerSpare.getSpareName() + "   |  Actual Price : " + computerSpare.getSparePrice() +"  |  +GST Price : "+computerSpare.getGSTPlusPrice());
	}
}
