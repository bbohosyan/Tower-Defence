package shop;

public class Shop {
	static Shop shop = new Shop();
	private Shop() {

	}
	
	public static Shop getInstance() {
		return shop;
	}
}
