package classes;
/*
 * Create a parent class Vehicle with a method speed() that prints "Speed varies for different vehicles."
Create subclasses:
Car that overrides speed() to print "The car speed is 120 km/h."
Bike that overrides speed() to print "The bike speed is 80 km/h."
Use polymorphism to display the speed of different vehicles in the Main class.


 */
class Vehicle{
	void speed() {
		System.out.println("Speed varies for different vehicles.");
	}
}
class Car extends Vehicle{
	void speed() {
		System.out.println("The car speed is 120 km/h.");
	}
}
class Bike extends Vehicle{
	void speed() {
		System.out.println("The car bike is 80 km/h.");
	}
}
public class SpeedChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj[] = new Vehicle[2];
		obj[0] = new Car();
		obj[1] = new Bike();
		obj[0].speed();
		obj[1].speed();
	}

}
