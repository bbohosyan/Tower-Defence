package player;

public class Player {
	
	private int diamonds = 0;

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

}
