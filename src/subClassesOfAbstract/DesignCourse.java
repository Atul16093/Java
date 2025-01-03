package subClassesOfAbstract;

import abstractClass.Course;
public class DesignCourse extends Course {
	private String tool;
	public DesignCourse(String courseName, int duration, String tool) {
		super(courseName, duration);
		this.tool = tool;
	}
	public DesignCourse() {}
	public void showContent() {
		System.out.println( "This course focuses on design using "+tool);
	}
}
