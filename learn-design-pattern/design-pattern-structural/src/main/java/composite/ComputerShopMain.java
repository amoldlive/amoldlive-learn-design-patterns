package composite;

public class ComputerShopMain {
	public static void main(String[] args) {
		Mouse mouse = new Mouse("Mouse", 690);
		printMousePrice(mouse);

		KeyBoard keyBoard = new KeyBoard("KeyBoard", 1094);
		printKeyBoardPrice(keyBoard);
		
		HardDisk hardDisk=new HardDisk("Hard Disk", 5000);
		printHardDiskPrice(hardDisk);
	}

	public static void printMousePrice(Mouse mouse) {
		System.out.println("Spare Name : " + mouse.getSpareName() + "   |  Actual Price : " + mouse.getSparePrice() +"  |  +GST Price : "+mouse.getGSTPlusPrice());
	}

	public static void printKeyBoardPrice(KeyBoard keyBoard) {
		System.out.println("Spare Name : " + keyBoard.getSpareName() + "   |  Actual Price : " + keyBoard.getSparePrice() +"  |  +GST Price : "+keyBoard.getGSTPlusPrice());
	}
	
	public static void printHardDiskPrice(HardDisk hardDisk) {
		System.out.println("Spare Name : " + hardDisk.getSpareName() + "   |  Actual Price : " + hardDisk.getSparePrice() +"  |  +GST Price : "+hardDisk.getGSTPlusPrice());
	}
}
