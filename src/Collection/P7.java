package Collection;
/*QNO 2.
ArrayList of Objects
Objective: Use an ArrayList to manage custom objects.
Tasks:

Create a Student class with attributes like name, age, and marks.
Add multiple Student objects to an ArrayList.
Display the details of all students.
*/
import java.util.ArrayList;
class Student{
	private String name ;
	private int age;
	private int marks;
	public Student(String name , int age , int marks) {
		this.name = name ;
		this.age = age;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return name +" , "+age+" , "+marks;
	}
}
public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(new Student("Rohan" , 24 , 78));
		al.add(new Student("Shubham" , 25 , 85));
		al.add(new Student("Rohit" , 20 , 76));
		al.add(new Student("Vikash" , 25 , 80));
		/*We must need to override the toString method for seeing the value, if
		we not do so it'll give us hashCode/hexadecimal value. Becacuse we're printing the object directly , and if we 
		don't override the toString method so it'll run the object class toString method and that have code to hexdecimal value based on
		the object address*/
		System.out.print(al);
	}

}
