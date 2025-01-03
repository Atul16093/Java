package subClassesOfAbstract;

import abstractClass.GameCharacter;
public class Warrior extends GameCharacter{
	public int strength;

	public Warrior(int strength) {
		super();
		this.strength = strength;
	}
	public void attack() {
		if(strength >= 1 ) {
		int str = strength*3;
		System.out.println("Attack : Powerful sword slash for "+str+" damage");
		}else {
			System.out.println("Invalid Strength");
		}
	}
	public void defend() {
		if(strength >= 1 ) {
		System.out.println("Defend : Raises shield, defence boosted by !"+strength);
		}
	}
	public Warrior() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
