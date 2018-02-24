package shop;

public class Frozotov {
	private short price = 50;
	
	static Frozotov frozotov = new Frozotov();

	private Frozotov() {

	}

	public static Frozotov getInstance() {
		return frozotov;
	}

	public short getPrice() {
		return this.price;
	}
}
