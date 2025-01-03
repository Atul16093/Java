package subClassesOfInterface;

import Interface.LibraryOperations;
import java.util.Date;
public class Student implements LibraryOperations{
	String name;
	Date d1 = new Date();
	public Student() {}
	public Student(String name) {
		this.name = name;
	}
	public void issueBook() {
		System.out.printf("The name of issued book is : %s \nIssued on : %s\nBy student", name , d1);
	}
	public void returnBook() { 
		System.out.printf("The return book name is : %s \nReturn on : %s\nBy student ",name, d1);
	}
}
