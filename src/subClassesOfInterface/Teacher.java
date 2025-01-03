package subClassesOfInterface;

import java.util.Date;
import Interface.LibraryOperations;
import java.util.Date;

public class Teacher implements LibraryOperations{
	String name;
	Date d1 = new Date();
	public Teacher() {}
	public Teacher(String name) {
		this.name = name;
	}
	public void issueBook() {
		System.out.printf("The name of issued book is : %s\nIssued on %s \nBy staff : ", name , d1);
	}
	public void returnBook() { 
		System.out.printf("The return book name is : %s\nReturn on %s \nBy staff : ",name, d1);	}
}
