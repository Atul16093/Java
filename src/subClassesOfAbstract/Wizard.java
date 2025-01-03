package subClassesOfAbstract;

import abstractClass.GameCharacter;

public class Wizard extends GameCharacter{
	public int magical;

	public Wizard(int magical) {
		super();
		this.magical = magical;
	}

	public Wizard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void attack() {
		if( magical >= 106 ) {
			int magic = magical*2;
		System.out.println("Attack: Casts spell, deals "+ magic +" magical damage!");
		}else {
			System.out.println("Invalid input");
		}
	}
	public void defend() {
		if(magical >= 106) {
		System.out.println("Defend: Creates magical barrier, defence boosted by "+magical +" !");
		}
	}
}
