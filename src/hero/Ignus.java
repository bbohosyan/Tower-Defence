package hero;

public class Ignus implements IHero {
	
	@Override
	public byte getHealth() {
		return 6;
		
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
