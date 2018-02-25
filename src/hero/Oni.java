package hero;

public class Oni implements IHero {

	@Override
	public byte getHealth() {
		return 7;
		
	}

	@Override
	public byte getMeleeDamage() {
		return 8;
		
	}

	@Override
	public byte getRangedDamage() {
		return 0;
		
	}

	@Override
	public byte getSpeed() {
		return 6;
		
	}
	
	@Override
	public void specialAttack() {
		// TODO Auto-generated method stub
		
	}
}
