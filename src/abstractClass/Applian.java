package abstractClass;

abstract class Appliance{
	private String brand;
	private boolean isOn;
	public Appliance(String brand , boolean isOn) {
		this.brand = brand;
		this.isOn = isOn;
	}
	public Appliance() {
		
	}
	abstract void operate();
	void turnOn() {
		isOn = true;
		System.out.println("The appliance is now ON.");
	}
	void turnOff() {
		isOn = false;
		System.out.println("The appliance is now ON.");
	}
}
class WashingMaching extends Appliance{
	
	void operate() {
		System.out.println("The washing machine is washing clothes.");
	}
}
class Refrigerator extends Appliance {
	void operate() {
		System.out.println("The refrigerator is cooling items.");
	}
}
public class Applian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Appliance obj = new WashingMaching();
		Appliance obj1 = new Refrigerator();
		System.out.println("Washing Machine");
		obj.turnOn();
		obj.operate();
		obj.turnOff();
		System.out.println("Refrigerator");
		obj1.turnOn();
		obj1.operate();
		obj1.turnOff();
	}

}

