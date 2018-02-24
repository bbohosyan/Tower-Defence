package shop;

public class ChillWand {
	private short price = 250;

	static ChillWand chillWand = new ChillWand();

	private ChillWand() {

	}

	public static ChillWand getInstance() {
		return chillWand;
	}

	public short getPrice() {
		return this.price;
	}

}
