package classes;
/*Create a parent class Employee with a method calculateSalary() that prints "Base salary calculation for Employee."
Create subclasses:
Manager that overrides calculateSalary() to add a bonus to the base salary.
Developer that overrides calculateSalary() to calculate salary based on hours worked.
Demonstrate the overridden method in the Main class by creating an array of Employee objects and calling calculateSalary() on each.*/
class Employee{
	void calculateSalary() {
		System.out.println("Base salary calculation for Employee.");
	}
}
class Manager extends Employee{
	void calculateSalary() {
		System.out.println("Add Bonus to the base salary");
	}
}
class Developer extends Employee{
	void calculateSalary() {
		System.out.println("calculate salary based on hours worked.");
	}
}

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj[] = new Employee[3];
		obj[0] = new Employee();
		obj[1] = new Manager();
		obj[2] = new Developer();
		obj[0].calculateSalary();
		obj[1].calculateSalary();
		obj[2].calculateSalary();	}

}
