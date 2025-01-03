package classes;
/*Create a parent class Animal with a method makeSound() that prints "Some generic sound."
Create subclasses:
Dog that overrides makeSound() to print "Woof Woof."
Cat that overrides makeSound() to print "Meow Meow."
In the Main class, use polymorphism to call makeSound() on different Animal objects.
*/
abstract class Animal{
	abstract void makeSound();
}
class Dog extends Animal{
	void makeSound() {
		System.out.println("Woof Woof");
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("Meow Meow");
	}
}
public class SoundOfAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dynamic method dispatch and run time polymorphism UpCasting
		Animal obj[] = new Animal[3];
		obj[0] = new Dog();
		obj[1] = new Cat();
		obj[0].makeSound();
		obj[1].makeSound();
	}

}
