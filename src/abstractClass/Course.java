package abstractClass;

public abstract class Course {
    private String courseName;
    private int duration;
    abstract public void showContent();
     public void displayDetails() {
    	 System.out.println(courseName +",\n"+duration+" Weeks");
     }
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Course(String courseName, int duration) {
		this.courseName = courseName;
		this.duration = duration;
	}
	public Course() {
	}
    
}
