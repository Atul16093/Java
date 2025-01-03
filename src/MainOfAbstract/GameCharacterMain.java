package MainOfAbstract;
import abstractClass.GameCharacter;
import subClassesOfAbstract.Warrior;
import subClassesOfAbstract.Wizard;

import java.util.Scanner;
public class GameCharacterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose a character For Warrior Press 1 and For Wizard Press2 :  ");
        int userInput = sc.nextInt();
        if(userInput == 1) {
        	System.out.print("Enter the WARRIOR charater Strength : ");
        	int strength = sc.nextInt();
        	GameCharacter obj = new Warrior(strength);
        	System.out.println("Warrior Actions:");
        	obj.attack();
        	obj.defend();
        }else if(userInput == 2) {
        	System.out.print("Enter the WIZARD charater magical power : ");
        	int magical = sc.nextInt();
        	GameCharacter obj = new Wizard(magical);
        	obj.attack();
        	obj.defend();
        }else {
        	System.out.println("Invalid input");
        }
	}

}
