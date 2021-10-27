package composite;

public class Mouse implements ComputerSpare{
	private String spareName;
	private int sparePrice;

	public Mouse(String spareName, int sparePrice) {
		super();
		this.spareName = spareName;
		this.sparePrice = sparePrice;
	}

	public String getSpareName() {
		return spareName;
	}

	public int getSparePrice() {
		return sparePrice;
	}


	public int getGSTPlusPrice() {
		return this.getSparePrice() + (this.getSparePrice() * 18 / 100);
	}



}
