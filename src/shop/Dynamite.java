package shop;

public class Dynamite implements IReinforcement {
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

	@Override
	public void Activate() {
		// TODO Auto-generated method stub
		
	}
}
