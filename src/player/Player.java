package player;

import shop.ChillWand;
import shop.Dynamite;
import shop.FatBoy;
import shop.GoldBag;
import shop.Heartbox;
import shop.Shop;

public class Player {

	private int diamonds = 0;
	private short numberOfChillWands = 0;
	private short numberOfDynamites = 0;
	private short numberOfFatBoys = 0;
	private short numberOfGoldBags = 0;
	private short numberOfHeartboxes = 0;

	static Player player = new Player();

	private Player() {

	}

	public static Player getInstance() {
		return player;
	}

	public int getDiamonds() {
		return diamonds;
	}

	public void setDiamonds(int diamonds) {
		this.diamonds = diamonds;
	}

	public void buyReinforcement(String nameOfTheReinforcement) {
		Shop.getInstance().reduceReinforcementQuantity(nameOfTheReinforcement);
		Player.getInstance().increaseReinforcementQuantity(nameOfTheReinforcement);
		Player.getInstance().payTheReinforcement(nameOfTheReinforcement);
	}

	private void payTheReinforcement(String nameOfTheReinforcement) {
		switch (nameOfTheReinforcement) {
		case "Chill Wand":
			diamonds -= ChillWand.getInstance().getPrice();
			break;
		case "Dynamite":
			diamonds -= Dynamite.getInstance().getPrice();
			break;
		case "Fat Boy":
			diamonds -= FatBoy.getInstance().getPrice();
			break;
		case "Gold Bag":
			diamonds -= GoldBag.getInstance().getPrice();
			break;
		case "Heartbox":
			diamonds -= Heartbox.getInstance().getPrice();
			break;

		default:
			break;
		}
	}

	private void increaseReinforcementQuantity(String nameOfTheReinforcement) {
		switch (nameOfTheReinforcement) {
		case "Chill Wand":
			numberOfChillWands++;
			break;
		case "Dynamite":
			numberOfDynamites++;
			break;
		case "Fat Boy":
			numberOfFatBoys++;
			break;
		case "Gold Bag":
			numberOfGoldBags++;
			break;
		case "Heartbox":
			numberOfHeartboxes++;
			break;

		default:
			break;
		}
	}
}
