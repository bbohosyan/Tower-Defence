package hero;

public class Hacksaw implements IHero {
	
	@Override
	public byte getHealth() {
		return 8;
		
	}

	@Override
	public byte getMeleeDamage() {
		return 7;
		
	}

	@Override
	public byte getRangedDamage() {
		return 0;
		
	}

	@Override
	public byte getSpeed() {
		return 3;
		
	}
	
	@Override
	public void specialAttack() {
		// TODO Auto-generated method stub
		
	}
}
