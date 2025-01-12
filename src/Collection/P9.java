package Collection;

import java.util.ArrayList;
import java.util.Scanner;

/*
QNO 4:

Create a Java program that enables users to dynamically input employee details and store them in an ArrayList.

The program should include a class named "Employee" with private attributes:
1.	employeeName - String
2.	employeeId - int
3.	employeeDepartment - String

The Employee class should have the following methods:
1.	Write a getter method for the above-mentioned attributes.
2.	An overridden toString() method that returns the employee's details.
Input format :
The first line consists of the size of the ArrayList.
The next consecutive line contains employeeName, employeeId, employeeDepartment.
Output format :
The output should display the list of employees.
Refer to the sample output for reference.
Sample test cases :
Input 1 :
1
Elon
101
CEO
Output 1 :
List of All Employees
Employee [employeeName=Elon, employeeId=101, employeeDepartment=CEO]
Input 2 :
2
Elon
101
CEO
Micheal
1001
Manager
Output 2 :
List of All Employees
Employee [employeeName=Elon, employeeId=101, employeeDepartment=CEO]
Employee [employeeName=Micheal, employeeId=1001, employeeDepartment=Manager]*/
class Employee{
	private int eId;
	private String eName;
	private String eDepartment;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eId, String eName, String eDepartment) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eDepartment = eDepartment;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteDepartment() {
		return eDepartment;
	}

	public void seteDepartment(String eDepartment) {
		this.eDepartment = eDepartment;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eDepartment=" + eDepartment + "]";
	}
	
}
public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList <Employee> al = new ArrayList<Employee>();
		System.out.print("The number of input would you like to enter : ");
		int size = Integer.parseInt(sc.nextLine());
		for(int i = 0 ; i<size ; i++) {
			System.out.print("Enter your id : ");
			int eId = Integer.parseInt(sc.nextLine());
			System.out.print("Enter your Name : ");
			String eName = sc.nextLine();
			System.out.print("Enter your Department : ");
			String eDepartment = sc.nextLine();
			al.add(new Employee(eId , eName , eDepartment));
		}
		System.out.println(al);
	}

}
