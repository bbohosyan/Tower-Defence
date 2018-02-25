package hero;

public class HeroRoom {
	
	private boolean isHeroSelected = false;
	
	public HeroRoom() {

	}
	
	public void selectHero() {
		isHeroSelected = true;
	}
	
	public void deselectHero() {
		isHeroSelected = false;
	}
	
}
