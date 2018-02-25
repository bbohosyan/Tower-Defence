package shop;

public class FatBoy implements IReinforcement {
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

	@Override
	public void Activate() {
		// TODO Auto-generated method stub
		
	}
}
