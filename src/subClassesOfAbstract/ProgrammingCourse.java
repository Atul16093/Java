package subClassesOfAbstract;
import abstractClass.Course;
public class ProgrammingCourse extends Course {
	private String language;
	public ProgrammingCourse(String courseName, int duration, String language) {
		super(courseName, duration);
		this.language = language;
	}
    public ProgrammingCourse() {}
	public void showContent() {
		System.out.println("This course covers programming in "+language+" Language");
	}
	
}
