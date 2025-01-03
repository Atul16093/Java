package MainOfAbstract;
import abstractClass.Course;
import subClassesOfAbstract.DesignCourse;
import subClassesOfAbstract.ProgrammingCourse;

import java.util.Scanner;
public class CourseMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter the Course name : ");
		String name = sc.nextLine();
		System.out.println("Enter the duration (In weeks: ");
		int duration =Integer.parseInt(sc.nextLine());
		System.out.println("Enter the language of the course : ");
		String language = sc.nextLine();
		System.out.println("Enter  the Designing tool name : ");
		String tool = sc.nextLine();
		Course obj = new ProgrammingCourse(name , duration , language);
		Course obj1 = new DesignCourse(name , duration , tool);
		obj.displayDetails();
		obj.showContent();
		obj1.displayDetails();
		obj1.showContent();
	}

}
