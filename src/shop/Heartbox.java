package shop;

public class Heartbox {
	private short price = 350;
	
	static Heartbox heartbox = new Heartbox();

	private Heartbox() {

	}

	public static Heartbox getInstance() {
		return heartbox;
	}

	public short getPrice() {
		return this.price;
	}
}
