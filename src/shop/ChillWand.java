package shop;

public class ChillWand implements IReinforcement {
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

	@Override
	public void Activate() {
		// TODO Auto-generated method stub
		
	}

}
