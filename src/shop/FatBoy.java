package shop;

public class FatBoy {
	private short price = 999;
	
	static FatBoy fatBoy = new FatBoy();

	private FatBoy() {

	}

	public static FatBoy getInstance() {
		return fatBoy;
	}

	public short getPrice() {
		return this.price;
	}
}
