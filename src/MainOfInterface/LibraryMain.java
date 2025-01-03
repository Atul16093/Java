package MainOfInterface;

import subClassesOfInterface.Teacher;
import subClassesOfInterface.Student;
import Interface.LibraryOperations;
public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryOperations obj = new Student("How to talk to anyone ");
		LibraryOperations obj1 = new Teacher("The power of efficasious speaking");
		obj.issueBook();
		obj1.issueBook();
	}

}
