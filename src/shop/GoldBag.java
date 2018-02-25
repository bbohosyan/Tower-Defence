package shop;

public class GoldBag implements IReinforcement {
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

	@Override
	public void Activate() {
		// TODO Auto-generated method stub
		
	}
}
