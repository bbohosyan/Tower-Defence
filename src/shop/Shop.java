package shop;

public class Shop {
	
	private short numberOfChillWands = 999;
	private short numberOfDynamites = 999;
	private short numberOfFatBoys = 999;
	private short numberOfGoldBags = 999;
	private short numberOfHeartboxes = 999;
	
	static Shop shop = new Shop();
	private Shop() {

	}
	
	public static Shop getInstance() {
		return shop;
	}
	
	public void reduceReinforcementQuantity(String nameOfTheReinforcement) {
		switch (nameOfTheReinforcement) {
		case "Chill Wand":
			numberOfChillWands--;
			break;
		case "Dynamite":
			numberOfDynamites--;
			break;
		case "Fat Boy":
			numberOfFatBoys--;
			break;
		case "Gold Bag":
			numberOfGoldBags--;
			break;
		case "Heartbox":
			numberOfHeartboxes--;
			break;

		default:
			break;
		}
	}
}
