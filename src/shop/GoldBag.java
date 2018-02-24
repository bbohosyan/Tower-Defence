package shop;

public class GoldBag {
	private short price = 850;
	
	static GoldBag goldBag = new GoldBag();

	private GoldBag() {

	}

	public static GoldBag getInstance() {
		return goldBag;
	}

	public short getPrice() {
		return this.price;
	}
}
