package shop;

public class Dynamite {
	private short price = 50;

	static Dynamite dynamite = new Dynamite();

	private Dynamite() {

	}

	public static Dynamite getInstance() {
		return dynamite;
	}

	public short getPrice() {
		return this.price;
	}
}
